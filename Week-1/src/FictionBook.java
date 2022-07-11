public class FictionBook extends Book {
    String category;

    protected FictionBook() {

    }

    protected FictionBook(String category) {
        this.category = category;
    }

    protected FictionBook(int bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    protected String getCategory() {
        return category;
    }

    protected void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                ", BookCode=" + BookCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

}
