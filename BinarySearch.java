public class BinarySearch {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int last = numbers.length-1;
        int first = 0;


        System.out.println(binary(numbers, target, first, last));
    }

    private static int binary(int[] numbers, int target, int first, int last) {
        if (first <= last){
            int mid = (first + last)/2;
            if(numbers[mid] < target){
                return binary(numbers, target, mid + 1, last);
            }else if (numbers[mid] == target){
                return mid;
            }else {
                return  binary(numbers, target, first, mid - 1);
            }
        }
        return -1;
    }
}
