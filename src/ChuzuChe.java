import java.util.Scanner;

/*
* 白天6:00-21:00 起步价为6元
* 晚上22：00-5:00 起步价为7元
* 起步价包含两公里，超出部分按照每公里1.5元收费
* 每次乘车加收1元燃油附加税
*
* 输出要求：
* 输入打的时间（0-23）和距离，计算本次打车的费用
* */
public class ChuzuChe {
    public static void main(String args[]){
        Scanner sca = new Scanner(System.in);
        int shijian,juli;
        double fee = 0;
         double  sum;
        System.out.println("所需要达到的目的的距离:");
        juli = sca.nextInt();
        System.out.println("时间（只输入小时,范围为0-23）:");
        shijian = sca.nextInt();
        if (shijian > 6 && shijian < 21){
            if(juli<=2){
                fee = 6 + (juli - 2)*1.5;
            }else{
                fee = 6;
            }
        }else{
            if(juli<=2){
                fee = 7 + (juli - 2)*1.5;
            }else{
                fee = 7;
            }
        }
        //燃油附加费
        sum = fee+1;
        System.out.print(fee+ 1);
    }
}
