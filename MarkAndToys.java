import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarkAndToys {
    public static void main(String[] args) {
        //prices of the toys at the store
        ArrayList<Integer> prices = new ArrayList<>(
                Arrays.asList(1, 12, 5, 111, 200, 1000, 10));
        //budget for toys
        int budget = 50;

        System.out.println(numberOfToys(prices,budget));

    }

    private static int numberOfToys(List<Integer> prices, int budget) {
        int sum = 0;
        int count = 0;
        Collections.sort(prices);
        for (int i = 0; i < prices.size()-1; i++) {
            if((sum + prices.get(i)) > budget){
                break;
            }
            sum += prices.get(i);
            count++;
        }
        return count;
    }
}
