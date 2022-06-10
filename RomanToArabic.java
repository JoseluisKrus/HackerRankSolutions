import java.util.HashMap;
import java.util.Map;

public class RomanToArabic {
    public static void main(String[] args) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('M', 1000);
        String rom  = "MCMXCIV";
        int result = 0;
        for (int i = 0; i < rom.length(); i++) {
            if(i+1 ==rom.length()){
                result+=roman.get(rom.charAt(i));
                break;
            }
                if(roman.get(rom.charAt(i)) < roman.get(rom.charAt(i+1))){
                    result-=roman.get(rom.charAt(i));
                }else {
                    result+=roman.get(rom.charAt(i));
                }

        }
        System.out.println(result);



    }
}
