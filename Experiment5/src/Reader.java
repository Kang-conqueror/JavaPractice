public class Reader {

    public Reader(String Name) {
        this.Name = Name;
    }

    public String Name;


    public void Borrow(Book book){

        if (!book.isBorrowed){
            book.isBorrowed = true;
            System.out.println("图书借成功");
        }

        else{
            System.out.println("还未还，不能借");
        }

    }

    public void Return(Book book){

        if (book.isBorrowed){
            book.isBorrowed = false;
            System.out.println("图书还成功");
        }
        else{
            System.out.println("Error");
        }

    }


}
