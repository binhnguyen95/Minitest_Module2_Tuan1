public class Test_Book {
    public static void main(String[] args) {
        FictionBook fic1 = new FictionBook(1, "The Maid", 70, "Nita Prose", "Vien Tuong 1");
        FictionBook fic2 = new FictionBook(3, "Olga Dies Dreaming", 500, "Xochitl Gonzalez", "Vien Tuong 2");
        FictionBook fic3 = new FictionBook(5, "To Paradise", 110, "Hanya Yanagihara", "Vien Tuong 5");
        FictionBook fic4 = new FictionBook(4, "Violeta", 30, "Isabel Allende", "Vien Tuong 1");
        FictionBook fic5 = new FictionBook(2, "The Magnolia Palace", 150, "Fiona Davis", "Vien Tuong 1");

        ProgrammingBook pro1 = new ProgrammingBook(15, "Clean Code", 60, "Robert Martin", "Java", "Libraries");
        ProgrammingBook pro2 = new ProgrammingBook(25, "To Hoc Lap Trinh", 770, "Nhieu Tac Gia", "Scratch", "Libraries");
        ProgrammingBook pro3 = new ProgrammingBook(13, "Lap Trinh 7", 650, "Mr.P", "Python", "API");
        ProgrammingBook pro4 = new ProgrammingBook(55, "Lap Trinh 0", 90, "Mr.W", "C++", "Scaffolding");
        ProgrammingBook pro5 = new ProgrammingBook(76, "Lap Trinh 10", 340, "Mr.Q", "Java", "AJAX");


        FictionBook[] array1 = {fic1, fic2, fic3, fic4, fic5};
        ProgrammingBook[] array2 = {pro1, pro2, pro3, pro4, pro5};
        Book[] array3 = {fic1, fic2, fic3, fic4, fic5, pro1, pro2, pro3, pro4, pro5};

        System.out.println("Tong tien cua 10 cuon sach la: " + sum(array3));
        System.out.println("So sach ProgrammingBook co language la Java la: " + countLanguage(array2));

        System.out.println("So sach Fictioc co category la Vien Tuong 1: " + countCategory(array1));
        System.out.println("So sach Fiction co gia duoi 100: " + countPrice(array1));

    }

    //Count Language
    static int countLanguage(ProgrammingBook[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getLanguage() == "Java") {
                count++;
            }
        }
        return count;
    }

    //Total Price
    static int sum(Book[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        return sum;

    }

    //Count Category
    static int countCategory(FictionBook[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCategory() == "Vien Tuong 1") {
                count++;
            }
        }
        return count;
    }

    //Count Price
    static int countPrice(FictionBook[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice() < 100) {
                count++;
            }
        }
        return count;
    }

}