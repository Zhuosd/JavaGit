package Homework;
/**
 * 描述:
 * 这是一个学生类
 *
 * @outhor 71948
 * @create 2017-10-11 16:37
 * * 1）声明Student类。
　　属性包括：学号、姓名、英语成绩、数学成绩、计算机成绩、总成绩。
　　方法包括：构造方法、get方法、set方法、toString方法、equals方法、co
mpare方法（比较两个学生的总成绩，结果分大于、小于、等于），sum方法（计
算总成绩）、testScore方法（计算评测成绩）。
　　注：评测成绩可以取三门课成绩的平均分，另外任何一门课的成绩的改变
都需要重新计算总成绩，因此，在每一个set方法中应调用sum方法计算总成绩。
 */
public class Student {
    private String xuehao;
    private String name;
    private int EnglishScore;
    private int mathScore;
    private int ComputeScore;
    private int sumScore;

    //这是一个sum方法（用于计算总成绩）
    public int sum(){
        return this.EnglishScore + this.mathScore + this.ComputeScore ;
    }
    //这是一个testScore方法（计算评测成绩）
    public int testScore(){
        return sumScore/3;
    }


    public Student(String xuehao, String name, int englishScore, int mathScore, int computeScore) {
        this.xuehao = xuehao;
        this.name = name;
        EnglishScore = englishScore;
        this.mathScore = mathScore;
        ComputeScore = computeScore;
        this.sumScore = sum();
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(int englishScore) {
        EnglishScore = englishScore;
        this.sumScore = sum();
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
        this.sumScore = sum();
    }

    public int getComputeScore() {
        return ComputeScore;
    }

    public void setComputeScore(int computeScore) {
        ComputeScore = computeScore;
        this.sumScore = sum();
    }

    public int getSumScore() {
        return sumScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号='" + xuehao + '\'' +
                ", 姓名='" + name + '\'' +
                ", 英语=" + EnglishScore +'\'' +
                ", 数学=" + mathScore +'\'' +
                ", 计算机=" + ComputeScore +'\'' +
                ",总分=" + sumScore +'\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (EnglishScore != student.EnglishScore) return false;
        if (mathScore != student.mathScore) return false;
        if (ComputeScore != student.ComputeScore) return false;
        if (sumScore != student.sumScore) return false;
        if (xuehao != null ? !xuehao.equals(student.xuehao) : student.xuehao != null) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }


    public void compare(Student s){
        if (this.getSumScore() >= s.getSumScore()){
            System.out.println("s1成绩大于s2学生的成绩");
        } else if (this.getSumScore() <= s.getSumScore()) {
            System.out.println("s1成绩小于s2学生的成绩");
        }else{
            System.out.println("s1成绩小于s2学生的成绩");
        }
    }
}
