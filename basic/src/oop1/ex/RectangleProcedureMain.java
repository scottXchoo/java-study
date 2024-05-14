package oop1.ex;

public class RectangleProcedureMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calcArea(width, height);
        System.out.println("area = " + area);
        
        int perimeter = calcPerimeter(width, height);
        System.out.println("perimeter = " + perimeter);
        
        boolean isSquare = isSquare(width, height);
        System.out.println("isSquare = " + isSquare);
    }
    
    static int calcArea(int width, int height) {
        return width * height;
    }
    
    static int calcPerimeter(int width, int height) {
        return 2 * (width + height);
    }
    
    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
