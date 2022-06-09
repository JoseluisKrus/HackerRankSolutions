import java.util.ArrayList;
import java.util.List;

public class OrangesAndApples {
    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        List<Integer> apples = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);
        List<Integer> oranges = new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);

        int appleOnHouse = 0;
        for (int i = 0; i <apples.size() ; i++) {
            int applePosition = apples.get(i) + a;
            if (applePosition >=s && applePosition<=t){
                appleOnHouse++;
            }
        }
        int orangeOnHouse = 0;
        for (int i = 0; i <oranges.size() ; i++) {
            int orangePosition = oranges.get(i) + b;
            if (orangePosition >=s && orangePosition<=t){
                orangeOnHouse++;
            }
        }
        System.out.println(appleOnHouse);
        System.out.println(orangeOnHouse);
    }
}
