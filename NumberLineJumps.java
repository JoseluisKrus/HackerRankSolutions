public class NumberLineJumps {
    public static void main(String[] args) {

        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;

        catchUp(x1, v1, x2, v2);

    }

    private static void catchUp(int x1, int v1, int x2, int v2) {
        String answer = "No";
        boolean canCatchUp = v2 < v1;
        if(canCatchUp){
            boolean willIntersect = (x1 - x2) % (v2 - v1) ==0;
            if(willIntersect){
                answer = "Yes";
            }
        }
        System.out.println(answer);
    }
}
