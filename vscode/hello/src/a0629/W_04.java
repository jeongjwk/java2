package a0629;

public class W_04 {
    public static void main(String[] args) throws Exception {
        for(int i=1; i<=10; i++) {
            if(i%2 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
