interface Network{
    public void browse();// 定义浏览的抽象方法
}
class Real implements Network{  //真实上网的方式
    @Override
    public void browse() {      //覆写Network中的browse方法
        System.out.println("上网浏览文件");
    }
}
class Pxocy implements Network{ //代理上网方式
    private Network network;    //私有类的运用
    public Pxocy(Network network){  //设置代理操作的实际步骤
        this.network = network; //设置代理的子类
    }
    public void check(){}
    @Override
    public void browse() {  //无参构造方法
        this.check();   // 可以同时调用多个与具体业务相关的操作
        this.network.browse(); // 调用真实上网操作
    }
}
public class INetwork {
    public static void main(String args[]){
        Network net = new Pxocy(new Real());
        net.browse();
    }
}
