package HomeWork20171108;


/**
 * 描述:
 * 创建一学生类
 *
 * @outhor 71948
 * @create 2017-11-08 16:36
 */
public class Student {
    private String name;
    private int age;
    private double score;
    public Student(String name, int age, double score){
        super();
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public void printInfo(){
        System.out.println("name :" + this.name);
        System.out.println("age :" + this.age);
        System.out.println("score" + this.score);
    }
    public static void main(String[] args) {
        Student stu = new Student("卓胜达",20,100);
        stu.printInfo();
    }
}