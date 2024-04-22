
public class Main {
    public static void main(String[] args) {
        User guest1 = new User("guest1@example.com");
        User guest2 = new User("guest2@example.com");
        User user1 = new User("John", "Doe", "john@example.com", "password");


        guest1.transformToUser("Alice", "Smith", "guestpassword");
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