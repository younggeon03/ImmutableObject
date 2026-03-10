package lang.string;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int length =0;
        for( String word : arr ) {
            System.out.print(word+ ":"+word.length()+"\n");
            length += word.length();
        }
        System.out.println("sum = "+ length);
    }
}
