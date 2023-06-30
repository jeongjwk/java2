package a0629;

public class W_05 {
    public static void main(String[] args) throws Exception {
        // p138 확인문제 3번
        int sum = 0;
        for(int i=1; i<=100; i++) {
            if(i%3 == 0){
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
