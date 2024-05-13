package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        
        int bigNum = Math.max(num1, num2);
        System.out.println("bigNum = " + bigNum);
    }
}
