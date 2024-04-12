public class User {

    private int id;

    private String email;
    private String password;

    public User(){}

    public User(int id, String email, String password){

        this.id = id;
        this.email = email;
        this.password = password;

    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){

        return password;
    }

    @Override
    public String toString(){

        return Integer.toString(this.id);
    }

}
