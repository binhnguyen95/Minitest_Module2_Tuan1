public class Book {
    int BookCode;
    String name;
    int price;
    String author;

    protected Book() {
    }

    protected Book(int bookCode, String name, int price, String author) {
        BookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    protected int getBookCode() {
        return BookCode;
    }

    protected void setBookCode(int bookCode) {
        BookCode = bookCode;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getPrice() {
        return price;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    protected String getAuthor() {
        return author;
    }

    protected void setAuthor(String author) {
        this.author = author;
    }


}
