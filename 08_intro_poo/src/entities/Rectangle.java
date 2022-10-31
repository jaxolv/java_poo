package entities;

public class Rectangle {
    public double width;
    public double heigth;

    public double area() {
        return width * heigth;
    }

    public double perimeter() {
        return 2.0 * (width + heigth);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2.0) + Math.pow(heigth, 2.0));
    }

    public String toString(double x, double y, double z) {
        return "AREA = " + String.format("%.2f%n", x)
        + "PERIMETER = " + String.format("%.2f%n", y)
        + "DIAGONAL = " + String.format("%.2f", z);
    }
}
