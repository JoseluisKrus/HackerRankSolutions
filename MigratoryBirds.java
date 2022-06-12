import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args) {
        int [] birds = {1, 4, 4, 4, 5, 3};
        int n = birds.length;
        int key = 0;

        HashMap<Integer, Integer> indexNumber = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!indexNumber.containsKey(birds[i])){
              indexNumber.put(birds[i], 1);
            }else {
                indexNumber.put(birds[i], indexNumber.get(birds[i]) + 1 );
            }
        }
         int max_count = 0, res = -1;

        for(Map.Entry<Integer, Integer> val : indexNumber.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
        System.out.println(res);



        ///Counting sort

       int[] count = new int[5 + 1];


        /*
        for(int num:birds){
            count[num]++;
        }

        int occurences = 0;
        int maxIndex =1;
        for(int i=0;i<count.length;i++){
            if(count[i]>count[maxIndex]){
                maxIndex=i;
               // occurences = count[maxIndex];
            }
        }
        System.out.println(maxIndex);

        //System.out.println(occurences);

        */
    }
}
