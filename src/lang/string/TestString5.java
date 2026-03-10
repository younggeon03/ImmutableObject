package lang.string;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int a = str.indexOf(".");
        System.out.println("filename = "+str.substring(0,a));
        System.out.println("extName = "+str.substring(a) );

    }
}
