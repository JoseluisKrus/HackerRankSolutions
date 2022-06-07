import java.util.Arrays;

public class BubleSortAlgo {
    public static void main(String[] args) {

        //O(n^2)
        int[] numbers = {2, 6, 134, 87, 342, 543, 12, 98, 332, 174};
        System.out.println(Arrays.toString(numbers));
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
