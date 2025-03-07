class Book{
    String title;
    String author;
    String price;

    Book(String title,String author,String price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    Book(Book b){
        title=b.title;
        author=b.author;
        price=b.price;

    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("author : "+author);
        System.out.println("price: "+price);
    }
}
public class Const2{
    public static void main(String[] args) {
        
        Book obj1=new Book("Java programming","shaksphere","$150.00");
        Book obj2=new Book(obj1);
        System.out.println("Original Book:");
        obj1.display();
        System.out.println("Coped book");
        obj2.display();

    }
}
