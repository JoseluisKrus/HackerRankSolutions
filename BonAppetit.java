public class BonAppetit {
    public static void main(String[] args) {
        int[] items = {3, 10, 2, 9};
        int itemToSkip = 1;
        int moneyAnna = 7;

        int sum = 0;

        for (int i = 0; i < items.length; i++) {
            if(i !=itemToSkip){
                sum += items[i];
            }
        }
        int difference = moneyAnna - (sum/2);
        if(difference == 0){
            System.out.println("Bon appetite!");
        }else {
            System.out.println(difference);
        }
    }

}

