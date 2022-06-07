import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class DateFormat {
    public static void main(String[] args) {


    }
}
class Resulttt {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    private static final SimpleDateFormat TWELVE_TF = new SimpleDateFormat("hh:mm:ssa");
    private static final SimpleDateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm:ss");
    public static String timeConversion(String s) {
        try {
            return TWENTY_FOUR_TF.format(
                    TWELVE_TF.parse(s));
        } catch (ParseException e) {
            return s;
        }

    }


}
