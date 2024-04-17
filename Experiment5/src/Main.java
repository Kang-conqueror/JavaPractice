import java.util.Arrays;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void printBooks(Book[] bks){

        for(Book b : bks){

            String Author = b.Author;
            Double Price = b.Price;
            String Name = b.Name;
            String borrowStatus = "可借";
            if(b.isBorrowed){
                borrowStatus = "未还";
            }

            System.out.println(Name + ", " + Author + ", " + Price + "元, " + borrowStatus);

        }

    }


    public static void main(String[] args) {

        Library myLittleLibrary = new Library();

        //(1)
        myLittleLibrary.Books.add(new Book("张三著", 45.0, "Java 程序设计"));
        myLittleLibrary.Books.add(new Book("李四著", 50.0, "Java 核心设计"));
        myLittleLibrary.Books.add(new Book("王五著", 38.0, "Java 程序设计"));

        //(2)
        printBooks(myLittleLibrary.GetAllBooks());

        //(3)
        Reader oneBeautifulGirl = new Reader("meinv");

        Book[] bks = myLittleLibrary.FindBook("Java 程序设计");

        //(4)
        for (Book b : bks){
            if (Objects.equals(b.Author, "张三著")){
                oneBeautifulGirl.Borrow(b);
            }
        }
        printBooks(myLittleLibrary.GetAllBooks());

        //(5)
        for (Book b : bks){
            if (Objects.equals(b.Author, "张三著")){
                oneBeautifulGirl.Return(b);
            }
        }
        printBooks(myLittleLibrary.GetAllBooks());

    }
}