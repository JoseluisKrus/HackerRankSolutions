public class SelectionSort {
    public static void main(String[] args) {

        int [] numbers = {8, 4, 7, 3, 9, 1};

        selectionSort(numbers);
        for ( int i : numbers) {
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            int min = i;
            for (int j = i +1; j < numbers.length ; j++) {
                if (numbers[min] > numbers[j]){
                    min = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
    }
}
