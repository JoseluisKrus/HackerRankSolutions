import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = new LinkedList<>();
        for (int i = 2; i <=x ; i++) {
            boolean isPrime = true;
            for (int j = 2; j <=i/2 ; j++) {
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                numbers.add(i);
            }
        }
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
