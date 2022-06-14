import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
      int [] arr = {100,4,200,1,3,2};
      Set<Integer> targetSet = new HashSet<>();
        for (Integer i : arr) {
            targetSet.add(i);
        }
        int max  = 0;

        for (Integer i: arr) {
            if(!targetSet.contains(i-1)){
                int length =0;
                while (targetSet.contains(i+length)){
                    length+=1;
                }
                max = Math.max(max,length);
            }
        }
        System.out.println(max);

    }
}
