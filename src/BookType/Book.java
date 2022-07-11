package BookType;


public class Book {
    int BookCode;
    String name;
    int price;
    String author;

    public Book() {
    }

    public Book(int bookCode, String name, int price, String author) {
        BookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookCode() {
        return BookCode;
    }

    public void setBookCode(int bookCode) {
        BookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
