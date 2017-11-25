package day08;

/**
 * 描述:
 *
 * @outhor 71948
 * @create 2017-11-19 10:19
 */
public class Something {
    public static void main(String[] args) {
        Other o = new Other();
        new Something().addOne(o);
    }
    public void addOne(final Other o){
        o.i++;
    }
}
class Other{
    public int i;
}