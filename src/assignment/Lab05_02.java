package assignment;

import java.util.Scanner;

public class Lab05_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String myHand, comHand;
        System.out.print("나의 가위/바위/보: ");
        myHand = s.next();

        String[] hands = {"가위", "바위", "보"};
        int rnd = (int) (Math.random() % hands.length);
        comHand = hands[rnd];
        System.out.println("컴퓨터의 가위/바위/보: " + comHand);

        switch (myHand) {
            case "가위" -> {
                switch (comHand) {
                    case "가위" -> System.out.println("비김");
                    case "바위" -> System.out.println("짐");
                    case "보" -> System.out.println("이김");
                }
            }
            case "바위" -> {
                switch (comHand) {
                    case "바위" -> System.out.println("비김");
                    case "보" -> System.out.println("짐");
                    case "가위" -> System.out.println("이김");
                }
            }
            case "보" -> {
                switch (comHand) {
                    case "보" -> System.out.println("비김");
                    case "가위" -> System.out.println("짐");
                    case "주먹" -> System.out.println("이김");
                }
            }
            default -> System.out.println("가위/바위/보 중 하나를 내세요.");
        }

        s.close();
    }
}