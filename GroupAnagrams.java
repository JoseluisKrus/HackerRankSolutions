import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        Solutionss solution = new Solutionss();
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(words));
    }

}

class Solutionss {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        if (str.length == 0) {
            return res;
        }
        for (String s : str) {
            char[] cha = s.toCharArray();
            Arrays.sort(cha);
            String key = String.valueOf(cha);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;



        /* Another solution
        for(String s: strs){
            char[] hash = new char[26];
            for(char c: s.toCharArray()){
                hash[c-'a']++;
            }
            String str=new String(hash);
            if(map.get(str)==null){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }
        res.addAll(map.values());
        return res;


        */


    }
}
