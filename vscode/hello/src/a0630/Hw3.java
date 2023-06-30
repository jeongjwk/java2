package a0630;

public class Hw3 {
    public static void main(String[] args) {
        // p145 4-3
        int sum = 0;
        int totalSum = 0;
        for (int i = 1; i <=10; i++){
            sum = sum + i;
            totalSum += sum;
        }
        System.out.println(totalSum);
    }
}
