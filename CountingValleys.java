public class CountingValleys {
    public static void main(String[] args) {
        int steps = 8;
        String sequence = "DDUUUUDD";

        int valleys = 0;
        int lvl = 0;

        for (char c: sequence.toCharArray()) {
            if (c == 'U') lvl++;
            if (c == 'D') lvl--;

            if (lvl == 0 && c == 'U') valleys++;

        }
        System.out.println(valleys);
    }
}
