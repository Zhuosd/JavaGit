package day08;

import java.io.*;

/**
 * 描述:
 *
 * @outhor 71948
 * @create 2017-11-08 14:26
 */
class Book implements Serializable{
    int id;
    String name;
    String author;
    float price;
    public Book(int id,String name,String author,float price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
public class SerializableTest {
    public static void main(String[] args) throws Exception {
        Book book = new Book(102,"bao","zhuo",212);
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(("book.dat")));
        os.writeObject(book);
        os.close();
        book=null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"));
        ois.close();
    }
}