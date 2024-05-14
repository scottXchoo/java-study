package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calcArea() {
        return width * height;
    }

    int calcPerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
