package HomeWork20171108;

import java.io.RandomAccessFile;

/**
 * 描述:
 * 商品的增删查改（输入、查询、更改操作）
 *
 * @outhor 71948
 * @create 2017-11-17 16:03
 */
public class Work {
    String ShopThing;

    public Work(String shopThing) {
        ShopThing = shopThing;
    }

    //商品的修改操作
    public void InShopThing(Stories st,int n) throws Exception{
        RandomAccessFile ra = new RandomAccessFile(ShopThing,"rw");
        ra.seek(n*32);
        for (int i = 0;  i< 8; i++) {
             ra.writeChar(st.Name[i]);
        }
        ra.writeInt(st.number);
        ra.writeDouble(st.price);
        ra.writeInt(st.count);
        ra.close();
    }

    //查询商品的库存情况
    public void ReadShop(int n) throws  Exception{
        char ShopName[] = new char[8];
        RandomAccessFile ra = new RandomAccessFile(ShopThing,"r");
        ra.seek(n*32);
        for (int i = 0; i < 8; i++) {
            ShopName[i] = ra.readChar();
        }
        System.out.println("商品名称：");
        System.out.println(ShopName);
        System.out.println("编号：" + ra.readInt());
        System.out.println("价格：" + ra.readDouble());
        System.out.println("商品库存量：" + ra.readInt());
        ra.close();
        System.out.println();
    }

    //设置商品名称
    public void setShopThing(int n,String name) throws Exception{
        RandomAccessFile ra = new RandomAccessFile(ShopThing,"rw");
        ra.seek(n*32);
        char[] borrow = new char[8];
        if(name.toCharArray().length>8)
            System.arraycopy(name.toCharArray(),0,borrow,0,8);
        else
            System.arraycopy(name.toCharArray(),0,borrow,0,name.toCharArray().length);
        for (int i = 0; i < 8; i++) {
            ra.writeChar(borrow[i]);
        }
        ra.close();
    }

    //修改商品价格
    public void setShopPrice(int n,double price) throws  Exception{
        RandomAccessFile ra = new RandomAccessFile(ShopThing,"rw");
        ra.seek(n*32+8+4);
        ra.writeDouble(price);
        ra.close();
    }

    //修改商品库存量
    public void setShopCount(int n,int count)throws  Exception{
        RandomAccessFile ra = new RandomAccessFile(ShopThing,"rw");
        ra.seek(n*32+8+4);
        ra.writeFloat(count);
        ra.close();
    }
}