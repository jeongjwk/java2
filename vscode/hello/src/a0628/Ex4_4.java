package a0628;

import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        char grade = ' ';
        System.out.println("점수를 입력하세요.>");
        // 스캐너를 import
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 input에 저장

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.printf("당신의 학점은 %c입니다.%n", grade);
    }
}