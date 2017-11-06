package Test1;

interface Usb{
    public void start();
    public void stop();
}
class Computer{
    public  void plugin(Usb u){
        u.start();
        u.stop();
    }
}
class Flash implements Usb{
    @Override
    public void start() {
        System.out.println("开始");
    }

    @Override
    public void stop() {
        System.out.println("结束");
    }
}
public class part2 {
    public static void main(String[] args){
        Computer com = new Computer();
        com.plugin(new Flash());
//        com.plugin(new Print());
    }
}
