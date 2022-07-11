

public class ProgrammingBook extends Book {
    String language;
    String framework;


    protected ProgrammingBook() {

    }

    protected ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    protected ProgrammingBook(int bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    protected String getLanguage() {
        return language;
    }

    protected void setLanguage(String language) {
        this.language = language;
    }

    protected String getFramework() {
        return framework;
    }

    protected void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                ", BookCode=" + BookCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
