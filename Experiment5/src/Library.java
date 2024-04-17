import java.util.ArrayList;
import java.util.Objects;

public class Library {

    public Library(){}

    public ArrayList<Book> Books = new ArrayList<>();


    public Book[] FindBook(String BookName){

        ArrayList<Book> bks = new ArrayList<>();

        for(Book b : Books){
            if(Objects.equals(b.Name, BookName)) {
                bks.add(b);
            }
        }

        return bks.toArray(new Book[0]);
    }

    public Book[] GetAllBooks(){

        return Books.toArray(new Book[0]);
    }


}
