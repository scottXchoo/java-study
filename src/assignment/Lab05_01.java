package assignment;

import java.util.Scanner;
public class Lab05_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int age;
        System.out.print("나이 입력: ");
        age = s.nextInt();

        if (age >= 18) {
            System.out.println("즐거운 시간!");
        } else {
            System.out.println("집에 갈 시간!");
        }
        System.out.println("협조 감사!");

        s.close();
    }
}