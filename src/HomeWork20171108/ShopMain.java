package HomeWork20171108;

import java.util.Scanner;

/**
 * 描述:
 * 商品的主函数
 *
 * @outhor 71948
 * @create 2017-11-17 16:35
 */
public class ShopMain {
    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner(System.in);
        int number;
        String name;
        Work work = new Work("d:/test.txt");
        Stories[] stories = {
                new Stories("java从入门到放弃",1,99.9,100),
                new Stories("Oracle从学习到绝望",2,55.9,20),
                new Stories("jiaoyuxue",3,23.5,50)
        };
        for (int i = 0; i < stories.length; i++) {
            work.InShopThing(stories[i],i);
        }
        for (int i = 0; i < stories.length; i++) {
            work.ReadShop(i);
        }
        System.out.println("请输入要查询商品的编号");
        number = sca.nextInt();
        work.ReadShop(number-1);

        System.out.println("请输入要修改某一商品名称：编号和名字");
        number =sca.nextInt();
        name = sca.next();
        work.setShopThing(number-1,name);
        work.ReadShop(number-1);
    }
}