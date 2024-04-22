public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private boolean isGuest;


    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isGuest = false;
    }

    public User(String email) {
        this.email = email;
        this.isGuest = true;
    }

    public void transformToUser(String name, String lastName, String password) {
        if (isGuest) {
            this.name = name;
            this.lastName = lastName;
            this.password = password;
            this.isGuest = false;
        } else {
            System.out.println("This is not a guest account.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isGuest() {
        return isGuest;
    }

    public void setGuest(boolean guest) {
        isGuest = guest;
    }

    public static void main(String[] args) {
        User guest1 = new User("MMMMMM@gmail.com");
        User guest2 = new User("MMMMM2@gmail.com");
        User user1 = new User("Marcel", "Mel", "Marcel@gmail.com", "password");

        guest1.transformToUser("Franek", "Smith", "guestpassword");

        System.out.println("Guest 1: " + guest1.getName() + " " + guest1.getLastName() +
                ", Email: " + guest1.getEmail() + ", Password: " + guest1.getPassword() +
                ", Is Guest: " + guest1.isGuest());
        System.out.println("Guest 2: " + guest2.getName() + " " + guest2.getLastName() +
                ", Email: " + guest2.getEmail() + ", Password: " + guest2.getPassword() +
                ", Is Guest: " + guest2.isGuest());
        System.out.println("User 1: " + user1.getName() + " " + user1.getLastName() +
                ", Email: " + user1.getEmail() + ", Password: " + user1.getPassword() +
                ", Is Guest: " + user1.isGuest());
    }
}
