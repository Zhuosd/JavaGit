package day08;

/**
 * 描述:
 *
 * @outhor 71948
 * @create 2017-11-18 23:36
 */
class A{
    class B{
        public void print(){
            System.out.println("AAA");
        }
    }
}
public class demo1 {
    public static void main(String[] args) {
        A.B a = new A().new B();
        fun(a);
    }
    public static void fun(A.B temp){//在fun方法体里面需要调用方法体
        temp.print();
    }
}