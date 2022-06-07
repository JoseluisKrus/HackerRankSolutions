import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!numbers.contains(arr[i])){
                numbers.add(arr[i]);
            }else {
                System.out.println(true);
            }
        }
    }
}
