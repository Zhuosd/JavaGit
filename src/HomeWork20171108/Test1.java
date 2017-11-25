package HomeWork20171108;

/**
 * 描述:
 * 这是
 *
 * @outhor 71948
 * @create 2017-11-10 21:55
 */
public class Test1 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        F(1,100000);
        long end = System.currentTimeMillis();
        System.out.println("递归所使用的时间"+(end-begin) + "ms");

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        System.out.println("For遍历速度：" + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void F(int start,int end){
        if(start>end) return;
        System.out.println(start);
        F(start+1,end);
    }

}