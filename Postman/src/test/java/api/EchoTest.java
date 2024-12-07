package api;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class EchoTest {
    private final static String URL = "https://postman-echo.com/";

    @Test
    public void GETRequestTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Response response = given()
                .when()
                .get("get?foo1=bar1&foo2=bar2")
                .then().log().all()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .extract().response();
    }

    @Test
    public void POSTRawTextTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Response response = given()
                .when().post("post")
                .then().log().all()
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        String responseData = jsonPath.get("data"); // Exception из-за спецификаций, если их убрать возвращает null, не смог найти решения проблем
        Assertions.assertEquals("This is expected to be sent back as part of response body.", responseData);
    }

    @Test
    public void POSTFormDataTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Response response = given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .formParam("form.foo1", "bar1")
                .formParam("form.foo2", "bar1")
                .when().post("post")
                .then().log().all()
                .body("foo1", equalTo("bar1"))
                .body("foo2", equalTo("bar2"))
                .extract().response();
    }

    @Test
    public void PUTRequestTest() {
        given()
                .baseUri("https://postman-echo.com/")
                .when().put("put")
                .then().log().all().statusCode(HttpStatus.SC_OK)
                .and().body("data", equalTo("This is expected to be sent back as part of response body."));


    }

    @Test
    public void PATCHRequestTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Response response = given()
                .when().patch("patch")
                .then().log().all()
                .body("data", comparesEqualTo("This is expected to be sent back as part of response body."))
                .extract().response();
    }

    @Test
    public void DELETERequestTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Response response = given()
                .when().delete("delete")
                .then().log().body()
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .extract().response();
    }
    //Не могу понять почему возвращает либо null, либо <{}>
}


