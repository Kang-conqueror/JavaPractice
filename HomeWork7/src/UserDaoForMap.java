import java.util.*;

public class UserDaoForMap implements UserDao{

    //public Scanner scn = new Scanner(System.in);
    public Map<String, User> users = new HashMap<>();

    public UserDaoForMap(){}

    @Override
    public User addUser(User user) throws EmailExistException, Pwd2ShortException{

        if(users.containsKey(user.getEmail())){
            throw new EmailExistException("Email exist");
        }

        if(user.getPassword().length() <= 2){
            throw new Pwd2ShortException("pw too short");
        }

        return user;
    }


    @Override
    public User getUser(String email, String password)throws UserNotFoundException, PasswordException{

        if(!users.containsKey(email)){
            throw new UserNotFoundException("Email error");
        }

        User user = users.get(email);

        if(!Objects.equals(user.getPassword(), password)){
            throw new PasswordException("pw error");
        }
        return user;
    }
}
