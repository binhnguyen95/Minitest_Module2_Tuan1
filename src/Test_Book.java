import BookType.Book;
import BookType.FictionBook;
import BookType.ProgrammingBook;

public class Test_Book {
    public static void main(String[] args) {
        Book[] books = new Book[10];

        books[0] = new ProgrammingBook(15, "Clean Code", 60, "Robert Martin", "Java", "Libraries");
        books[1] = new ProgrammingBook(25, "To Hoc Lap Trinh", 770, "Nhieu Tac Gia", "Scratch", "Libraries");
        books[2] = new ProgrammingBook(13, "Introduction to Algorithms", 650, "Steve McConnell", "Python", "API");
        books[3] = new ProgrammingBook(55, "Code Complete", 90, "Erich Gamma", "C++", "Scaffolding");
        books[4] = new ProgrammingBook(76, "The Pragmatic Programmer", 340, "David Thomas", "Java", "AJAX");

        books[5] = new FictionBook(1, "The Maid", 70, "Nita Prose", "Vien Tuong 1");
        books[6] = new FictionBook(3, "Olga Dies Dreaming", 500, "Xochitl Gonzalez", "Vien Tuong 2");
        books[7] = new FictionBook(5, "To Paradise", 55, "Hanya Yanagihara", "Vien Tuong 5");
        books[8] = new FictionBook(4, "Violeta", 30, "Isabel Allende", "Vien Tuong 1");
        books[9] = new FictionBook(2, "The Magnolia Palace", 150, "Fiona Davis", "Vien Tuong 1");


        System.out.println("Tong tien cua 10 cuon sach la: " + getTotalPrice(books) );

        System.out.println("So sach ProgrammingBook co Language la Java la: " + getCountBookLanguage(books, "Java"));
        System.out.println("So sach ProgrammingBook co Language la Python la: " + getCountBookLanguage(books, "Python"));
//
        System.out.println("So sach Fiction co category la Vien Tuong 1: " + getCountBookCategory(books, "Vien Tuong 1"));
        System.out.println("So sach Fiction co category la Vien Tuong 2: " + getCountBookCategory(books, "Vien Tuong 2"));

        System.out.println("So sach Fiction co gia duoi 100: " + getCountByPrice(books) );

    }

    static int getTotalPrice(Book[] book) {
        int sum = 0;
        for (int i = 0; i < book.length ; i++) {
            sum += book[i].getPrice();
        }
        return sum;
    }

    static int getCountBookLanguage(Book[] book, String language) {
        int count = 0;
        for (int i = 0; i < book.length; i++) {
            if(book[i] instanceof ProgrammingBook) {
                String lang = ((ProgrammingBook)book[i]).getLanguage();
                if (lang.equals(language)) {
                    count++;
                }
            }
        }
        return count;
    }

    static int getCountBookCategory(Book[] book, String category) {
        int count = 0;
        for (int i = 0; i < book.length ; i++) {
            if(book[i] instanceof FictionBook) {
                String cate = ((FictionBook)book[i]).getCategory();
                if(cate.equals(category)) {
                    count++;
                }
            }
        }
        return count;
    }

    static int getCountByPrice(Book[] book) {
        int count = 0;
        for (int i = 0; i < book.length ; i++) {
            if(book[i] instanceof FictionBook) {
                int price = book[i].getPrice();
                if ( price < 100) {
                    count++;
                }
            }
        }
        return count;
    }



}