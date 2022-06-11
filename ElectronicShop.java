import java.util.Arrays;
import java.util.Collections;

public class ElectronicShop {
    public static void main(String[] args) {
        Integer [] keyboards = {40, 50 , 60};
        int [] drives = {5, 8, 12};

        int budget = 60;
        Arrays.sort(keyboards, Collections.reverseOrder());//Descending order
        Arrays.sort(drives);//Ascending order

        int max = -1;
        for(int i = 0, j = 0; i < keyboards.length; i++){
            for(; j < drives.length; j++){
                if(keyboards[i]+drives[j] > budget) break; //This prevents j from incrementing
                if(keyboards[i]+drives[j] > max)
                    max = keyboards[i]+drives[j];
            }
        }
        System.out.println(max);

    }
}
