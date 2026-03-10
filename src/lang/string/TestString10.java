package lang.string;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String [] array = fruits.split(",");
        String joined = "";
        for( String fruit : array){
            System.out.println(fruit);
        }
        String join = joined.join("->", array);
        System.out.println("joinedString = "+ join);
    }
}
