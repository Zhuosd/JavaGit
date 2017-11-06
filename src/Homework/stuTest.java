package Homework;

import java.text.DecimalFormat;

/**
 * 描述:
 * 声明测试类，生成若干个Student类、StudentXW类及StudentBZ类对象，并分别计算它们的评测成绩。
 *
 * @outhor 71948
 * @create 2017-10-13 15:42
 */
public class stuTest {
    public static void main(String[] args) {

        Student student[]={
            new Student("001","学1",56,87,95),
            new Student("002","学2",86,75,80),
            new Student("003","学3",42,77,65),
            new studentXW("005","委1",89,98,90,"数学代表"),
            new studentBZ("007","班1",89,87,87,"班长")
        };
        for (int i = 0; i < student.length; i++) {
            Student student1 = student[i];
            System.out.println("学生名字" + student[i].getName()
                                +"成绩" + new DecimalFormat("0.0").format(student[i].testScore()));
        }
        /*//以下为输出各个项目的总成绩
        System.out.print(s1);
        System.out.println("\n评测成绩："+ s1.testScore());
        System.out.println();

        System.out.print(s2);
        System.out.println("\n评测成绩："+ s2.testScore());
        System.out.println();

        System.out.print(s3);
        System.out.println("\n评测成绩："+ s3.testScore());
        System.out.println();

        System.out.print(s4);
        System.out.println("\n评测成绩："+ s4.testScore());
        System.out.println();

        System.out.print(xw1);
        System.out.println("\n评测成绩："+ xw1.testScore());
        System.out.println();

        System.out.print(xw2);
        System.out.println("\n评测成绩："+ xw2.testScore());
        System.out.println();

        System.out.print(bz);
        System.out.println("\n评测成绩："+ bz.testScore());
        System.out.println();*/

    }
}