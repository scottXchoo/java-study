package method.ex;

import java.util.Scanner;

public class MethodEx4Ref {
    public static void main(String[] args) {
        printMenu();

        Scanner s = new Scanner(System.in);
        int balance = 0;
        while (true) {
            System.out.print("선택: ");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    int depositAmount = s.nextInt();
                    balance = deposit(depositAmount, balance);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    int withdrawAmount = s.nextInt();
                    balance = withdraw(withdrawAmount, balance);
                    break;
                case 3:
                    checkBalance(balance);
                    break;
                case 4:
                    printEnd();
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("------------------------------------");
        System.out.println("1.입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
        System.out.println("------------------------------------");
    }

    public static int deposit(int depositAmount, int balance) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int withdrawAmount, int balance) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static void checkBalance(int balance) {
        System.out.println("현재 잔액: " + balance);
    }

    public static void printEnd() {
        System.out.println("시스템을 종료합니다.");
    }
}
