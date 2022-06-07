public class Fibonacci {
    public static void main(String[] args) {


        int n =40;
        //Memoization storing the values so we can look them up
        long [] previous = new long[n+1];
        System.out.println(fib(n,previous));

    }

    private static long fib(int n, long [] previous) {
        //look up the value if is in there;
        if (previous[n] != 0){
            return  previous[n];
        }

        long result;
        if (n <= 0){
            result = 0;
        }else if (n == 1){
            result =1;
        }else {
            result = fib(n-1, previous) +fib(n-2, previous);
        }
        previous[n] = result;
        return result;
    }


}
