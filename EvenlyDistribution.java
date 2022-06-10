import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenlyDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money: ");
        int money = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the amount of people: ");
        int people = Integer.parseInt(scanner.nextLine());
        divideMoney(money,people);
    }

    private static void divideMoney(int number1, int number2) {
        BigDecimal amount1 = new BigDecimal(number1);
        BigDecimal amount2 = new BigDecimal(number2);
        BigDecimal res  = amount1.divide(amount2, 2, RoundingMode.HALF_EVEN);
        List<BigDecimal> numbers = new ArrayList<>();
        int size = amount2.intValue() -1;
        for (int i = 0; i < size; i++) {
            numbers.add(res);
            if(i == size-1){
                numbers.add(amount1.divide(amount2, 2, RoundingMode.DOWN));
            }
        }
        BigDecimal sum = new BigDecimal(0);
        for (BigDecimal bd : numbers) {
           sum = sum.add(bd);
        }
        System.out.println(numbers + " Sum should be: " + amount1.setScale(2,RoundingMode.HALF_DOWN));

        System.out.println("The sum is: " + sum);
    }
}
