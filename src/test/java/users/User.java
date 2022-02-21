package users;

public class User implements IUser{
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(String username,String password,String firstName,String lastName){
        this.username=username;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }
}
