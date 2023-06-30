package a0629;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws Exception {
        // p139 확인문제 7번
        boolean run = true;
        int balance = 10000;

        Scanner scanner = new Scanner(System.in);

        while(run){
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");
            int menuNum = scanner.nextInt();

            switch(menuNum){
                case 1:
                    System.out.print("예금액>");
                    balance += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= scanner.nextInt();
                    break;
                case 3:
                    System.out.print("잔고>");
                    System.out.print(balance);
                    break;
                case 4:
                    run = false;                    
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
