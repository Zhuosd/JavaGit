class Book{
    private String title;
    private double price;

    public Book( ) {
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public boolean eeuals(Object obj){
        if(this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (obj instanceof Book){
            return false;
        }
        Book book = (Book) obj;
        if (this.title.equals(book.title)&& this.price == book.price){
            return true;
        }
        return false;

    }
    public String toString(){
        return "书名" + this.title + "价格" + this.price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
public class part3 {
    public static void main(String args[]){
        Book b1 = new Book("java课程",12);
        Book b2 = new Book("phpshu",23.3);
        System.out.println(b1.eeuals(b2));
    }
}
