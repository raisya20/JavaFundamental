package juaracoding;

public class userProfile {
    public static void main(String[] args) {
        String name = "Raisya";
        int age = 24;
        String email = "raisya@gmail.com";
        String address = "Jakarta";
        boolean isActive = true;


        System.out.println("User Profile :");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Email       : " + email);
        System.out.println("Address     : " + address);
        System.out.println("Active      : " + (isActive ? "Yes" : "No"));
    }
}
