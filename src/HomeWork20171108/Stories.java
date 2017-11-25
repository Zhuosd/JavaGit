package HomeWork20171108;

/**
 * 描述:
 * 商店商品的增删查改
 *一家杂货店的店主，需要查询、输入、修改任何
 * 一件商品的品名、价格、库存量信息。请用随
 * 机存取文件满足其要求，可以更新、查询信息。
 * 每件商品的标志为其记录号
 * @outhor 71948
 * @create 2017-11-10 21:02
 */
public class Stories {
    char Name[] = new char[8];
    int number;
    double price;
    int count;

    public Stories(String name,int number,double price,int count){
        if(name.toCharArray().length>8)
            System.arraycopy(name.toCharArray(),0, this.Name, 0,8);//如果字符长度大于8，只取前8个
        else
            System.arraycopy(name.toCharArray(),0,this.Name,0,name.toCharArray().length);//如果字符长度小于8，有几个填几个
        this.number=number;
        this.price=price;
        this.count=count;
    }

    public char[] getName() {
        return Name;
    }

    public void setName(char[] name) {
        Name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
