interface Shape {
    String getFillColor();

    String getBorderColor();

    double getArea();

    double getPerimeter();

    default double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    default double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    default double calculateTrianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}

class Circle implements Shape {
    private final double radius;
    private final String fillColor;
    private final String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return calculateCirclePerimeter(radius);
    }
}

class Rectangle implements Shape {
    private final double length;
    private final double width;
    private final String fillColor;
    private final String borderColor;

    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return calculateRectanglePerimeter(length, width);
    }
}

class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double side3;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter() {
        return calculateTrianglePerimeter(side1, side2, side3);
    }
}

public class Geometry {
    public static void main(String[] args) {
        Shape circle = new Circle(5.22, "Красный", "Черный");
        Shape rectangle = new Rectangle(4.3, 6.6, "Голубой", "Зеленый");
        Shape triangle = new Triangle(3.22, 4.22, 5.7, "Желтый", "Розовый");

        System.out.println("Круг: Периметр = " + circle.getPerimeter() + ", Площадь = " + circle.getArea() + ", Цвет заливки = " + circle.getFillColor() + ", Цвет границы = " + circle.getBorderColor());
        System.out.println("Прямоугольник: Периметр = " + rectangle.getPerimeter() + ", Площадь = " + rectangle.getArea() + ", Цвет заливки = " + rectangle.getFillColor() + ", Цвет границы = " + rectangle.getBorderColor());
        System.out.println("Треугольник: Периметр = " + triangle.getPerimeter() + ", Площадь = " + triangle.getArea() + ", Цвет заливки = " + triangle.getFillColor() + ", Цвет границы = " + triangle.getBorderColor());
    }
}