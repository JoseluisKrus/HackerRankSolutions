import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopK top = new TopK();
        int [] nums = {1,1,1,3,3,2,2};
        int k = 2;
        System.out.println(Arrays.toString(top.topKFrequent(nums,k))); ;
    }
}
class TopK {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elemFreq = new HashMap<>();
        //put all elements with theirFrequencies
        for (Integer n: nums) {
            elemFreq.put(n, elemFreq.getOrDefault(n,0)+1);
        }
        // create list with the frequencies (n+1) if all are the same
        List<Integer>[] freq = new List[nums.length+1];
        //looping through the map to put in the list how many freq an element has
        for (Map.Entry<Integer,Integer> entry: elemFreq.entrySet()) {
            //get the element
            int n = entry.getKey();
            //get the freq
            int f = entry.getValue();
            // if the Array is null create list and put the element at the concrete freq
            if(freq[f] == null){
                freq[f] = new ArrayList<>();
            }
            freq[f].add(n);
        }
        //create the answer
        int [] ans = new int[k];
        //counter
        int c = 0;
        //from back of the arrary to front and also look for the counter to be below
        for (int i = freq.length-1; i >0 && c<k; i--) {
            //if no value just skip
            if(freq[i] == null){
                continue;
            }
            //for every number add to the mix;
            for (int num:freq[i]) {
                ans[c++] = num;
                if(c==k){
                    break;
                }
            }

        }

        return ans;
    }
}
