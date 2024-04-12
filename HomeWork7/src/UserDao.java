public interface UserDao {

    public User addUser(User user)throws EmailExistException, Pwd2ShortException;

    public User getUser(String email, String password)throws UserNotFoundException, PasswordException;



}
