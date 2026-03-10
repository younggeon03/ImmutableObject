package lang.string;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] duo = email.split("@");
        System.out.println("ID: " + duo[0]);
        System.out.println("Domain: " +duo[1]);

    }
}
