package Game;
/**
 * 描述:
 * @outhor 71948
 * @create 2017-11-06 15:40
 */
public class Main1{
    //进行字符串的对比操作
public static boolean fun(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        if(s1.length()==0) return true;
        if(s1.charAt(0)!=s2.charAt(0)) return false;
            return fun(s1.substring(1),s2.substring(1));
}
    public static void main(String args[]){
        System.out.println(fun("adc","abcd"));
        System.out.println(fun("abc","abc"));
        }
}
