import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String word1 = "ara";
        String word2 = "naga";


        char [] charArray1 = word1.toCharArray();
        Arrays.sort(charArray1);
        char [] charArray2 = word2.toCharArray();
        Arrays.sort(charArray2);
        boolean result = Arrays.equals(charArray1, charArray2);
        System.out.println(result);
    }
}
