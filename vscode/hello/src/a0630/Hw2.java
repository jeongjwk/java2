package a0630;

public class Hw2 {
    public static void main(String[] args) {
        // p145 4-2
        int sum = 0;
        for (int i = 1; i<=20; i++){
            if (i %2!=0 && i%3!=0){   
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
