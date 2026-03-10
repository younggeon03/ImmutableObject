package lang.string;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String reversed = new StringBuilder(str).reverse().toString();
        // StringBuilder 는 가변객체라서 직접 수정이 가능함.
        System.out.println(reversed);
    }
}
