package seminars.third.tdd;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;
    boolean isAdmin = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if (this.name == name && this.password == password){
            this.isAuthenticate = true;
            return true;
        }else {
            this.isAuthenticate = false;
            return false;
        }
    }

}