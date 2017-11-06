package Test1;

public class Chi {
    public static void main(String args[]){
        int sum = 0;
        int other = 1; //第十天
        /*采用逆向进行计算
         *最后一天的数量为前一天
        */
        for (int dayTime = 9; dayTime>=1 ;dayTime--){
            sum = (other+1)*2;
            other = sum;
            System.out.println("第"+dayTime+"天还剩"+other+"个桃子");
        }
        System.out.println("第一天总共摘的数量为"+ sum + "个");
    }
}
