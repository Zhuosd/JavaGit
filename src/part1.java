abstract class Action{
    public static final int EAT = 1;
    public static final int SLEEP = 2;
    public static final int WORK = 3;

    public static int getEAT() {
        return EAT;
    }

    public static int getSLEEP() {
        return SLEEP;
    }

    public static int getWORK() {
        return WORK;
    }

    public void command(int flag){      //switch只支持数值判断，而if支持条件判断
        switch (flag){                 //
            case EAT :
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
            case EAT + WORK:
                this.eat();
                this.work();
                break;
        }
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}
class Robot extends Action{
    public void eat(){
        System.out.println("机器人补充能量");
    }
    public void sleep(){
        System.out.println("不需要休息");
    }
    public void work(){
        System.out.println("可以不断的工作");
    }
}
class Human extends  Action{
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("晚上进行睡觉");
    }
    public void work(){
        System.out.println("人为了梦想不断的进行工作");
    }
}
class Rig extends Action{
    public void eat(){
        System.out.println("就知道每天吃饭");
    }
    public void sleep(){
        System.out.println("然后就是睡觉");
    }
    public void work(){
        System.out.println("没有工作,等着被杀");
    }
}
public class part1 {
     public static void main(String[] args){
         fun(new Robot());
         fun(new Human());
         fun(new Rig());
     }
     public static void fun(Action act){
         act.command(Action.EAT);
         act.command(Action.SLEEP);
         act.command(Action.WORK);
     }
}
