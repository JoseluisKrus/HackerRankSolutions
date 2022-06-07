import java.util.*;

public class SalesbyMatch {
    public static void main(String[] args) {
        int n = 9;
        int [] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        Set<Integer> set = new HashSet<>();
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            if(!set.contains(socks[i])){
                set.add(socks[i]);
            }else {
                pairs++;
                set.remove(socks[i]);
            }
        }
        System.out.println(pairs);
    }
}
