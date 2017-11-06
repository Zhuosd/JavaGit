package Homework;

/**
 * 描述:
 * 声明StudentBZ（班长）类为Student类的子类。 　　
 * 在StudentBZ类中增加责任属性，并重写testScore方
 * 法（计算评测成绩，评测成绩=三门课的平均分+5）。
 *
 * @outhor 71948
 * @create 2017-10-13 15:40
 */
public class studentBZ extends Student {
    private String Reasonable;


    public studentBZ(String xuehao, String name, int englishScore, int mathScore, int computeScore , String reasonable) {
        super(xuehao, name, englishScore, mathScore, computeScore);
        Reasonable = reasonable;
    }

    @Override
    public int testScore() {
        return super.testScore()+5;
    }

    @Override
    public String toString() {
        return "studentBZ{" +
                "学号='" + this.getXuehao() + '\'' +
                ", 姓名='" + this.getName() + '\'' +
                ", 英语=" + this.getEnglishScore() +'\'' +
                ", 数学=" + this.getMathScore() +'\'' +
                ", 计算机=" + this.getComputeScore() +'\'' +
                ",总分=" + this.getSumScore() +'\'' +
                "Reasonable='" + Reasonable +'\'' +
                '}';
    }
}