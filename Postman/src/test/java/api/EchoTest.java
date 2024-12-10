package api;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoTest {
    private final static String URL = "https://postman-echo.com/";

    @Test
    public void GETRequestTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Response response = given()
                .when()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .get("get")
                .then()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .extract().response();
    }

    @Test
    public void POSTRawTextTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Response response = given()
                .body("This is expected to be sent back as part of response body.")
                .when().post("post")
                .then()
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        String responseData = jsonPath.get("data");
        Assertions.assertEquals("This is expected to be sent back as part of response body.", responseData);
    }

    @Test
    public void POSTFormDataTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Response response = given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("post")
                .then()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .extract().response();
    }

    @Test
    public void PUTRequestTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Response response = given()
                .body("This is expected to be sent back as part of response body.")
                .put("put")
                .then()
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        String responseData = jsonPath.get("data");
        Assertions.assertEquals("This is expected to be sent back as part of response body.", responseData);
    }

    @Test
    public void PATCHRequestTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Response response = given()
                .body("This is expected to be sent back as part of response body.")
                .patch("patch")
                .then()
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        String responseData = jsonPath.get("data");
        Assertions.assertEquals("This is expected to be sent back as part of response body.", responseData);
    }

    @Test
    public void DELETERequestTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Response response = given()
                .body("This is expected to be sent back as part of response body.")
                .delete("delete")
                .then()
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        String responseData = jsonPath.get("data");
        Assertions.assertEquals("This is expected to be sent back as part of response body.", responseData);
    }
}


