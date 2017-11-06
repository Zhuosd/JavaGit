package Homework;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * 描述:
 * 声明一个接口，此接口至少具有一个方法，在一个方法中声明内部类实现此接口，并返回此接口的引用
 *
 * @outhor 71948
 * @create 2017-10-31 19:01
 */
interface Fruit{
    void eat();
}

class Apple {
    public Fruit eat(){
        return new Fruit() {
            @Override
            public void eat() {
                System.out.println("这是一个苹果（内部类）");
            }
        };
    }
}
public class ShiYan6Implement1 {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        a1.eat().eat();
    }
}

