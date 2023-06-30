package a0629;

public class W_06 {
    public static void main(String[] args) throws Exception {
        // p138 확인문제 4번
        while (true){
            int num1 = (int)(Math.random()*6) + 1;
            int num2 = (int)(Math.random()*6) + 1;
            System.out.println("("+num1+","+num2+")");
            if ((num1+num2)==5){
                break;
            }
        }
    }
}
