import java.util.Random;
import java.util.Scanner;

public class Application {

    public Scanner scn = new Scanner(System.in);
    private UserDao dao;

    public Random random;

    private int id = random.nextInt(100) + 1;

    public Application(UserDao dao){
        this.dao = dao;
    }

    public void registe() throws EmailExistException, Pwd2ShortException {

        System.out.print("Write new ur email address: ");
        String email = scn.next();

        System.out.print("Write new ur password: ");
        String pw = scn.next();

        User user = new User(id, email, pw);

        if(dao.addUser(user) != null){
            System.out.println("Complete");
        }
        else {
            System.out.println("error");
        }

    }

    public void login() throws UserNotFoundException, PasswordException {

        System.out.print("Write ur email address: ");
        String email = scn.next();

        System.out.print("Write ur password: ");
        String pw = scn.next();

        if(dao.getUser(email, pw) != null){
            System.out.println("Log in");
        }
        else {
            System.out.println("error");
        }

    }


}
