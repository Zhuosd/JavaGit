package Test1;

public class Malasong {
    public static void main(String args[]) {
        for (int i = 1; i <= 40; i++) {
            System.out.println("每天早上的训练计划是围着操场跑40圈");
            if (i == 10) {
                System.out.println("肚子疼，我不跑了");
                break;
            }
        }
    }
}
