package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.height = 8;
        r.width = 5;

        int area = r.calcArea();
        System.out.println("area = " + area);
        
        int perimeter = r.calcPerimeter();
        System.out.println("perimeter = " + perimeter);
        
        boolean isSquare = r.isSquare();
        System.out.println("isSquare = " + isSquare);
    }
}
