
import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Abby";


        System.err.println(Arrays.toString(staffLastYear));
        System.err.println(Arrays.toString(staffThisYear));
    }
}
