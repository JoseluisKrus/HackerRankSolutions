public class InsertionSort {
    public static void main(String[] args) {
        int [] numbers = {2, 1, 5, 4};

        for (int i = 1; i < numbers.length ; i++) {
            int currentValue = numbers[i];

            int j = i -1;
            while ( j >=  0 && numbers[j] > currentValue) {
                numbers[j +1] = numbers[j];
                j--;
            }
            numbers[j+1] = currentValue;
        }
    }
}
