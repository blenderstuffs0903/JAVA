class Book {
    String bookTitle, author;
    int price;
    Book (String bookTitle, String author, int price) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    void getPrice() {
        System.out.println("Price = " + price);
    }
}
public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("C Language", "Gotfred", 570);
        b1.getPrice();
    }
}
