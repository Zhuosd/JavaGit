package HomeWork20171108;

/**
 * 描述:
 *
 * @outhor 71948
 * @create 2017-11-10 21:47
 */
public class Test {
    public static int f(int[] a , int begin){
        if (begin == a.length) return 0;
        int x = f(a,begin+1);
        return a[begin];
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        int num = f(a,1);
        System.out.println(num);
    }
}