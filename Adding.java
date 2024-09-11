import java.util.ArrayList;
import java.util.Arrays;

public class Adding {

    public static String newNumbers(int num) {

        ArrayList<Integer> mainNums = new ArrayList<Integer>();

        for (int i = num; i >= 2; i--) {
            if (i % 2 == 0) {
                mainNums.add(Integer.valueOf(i));
            } else {
                continue;
            }

        }

        var finalArr = mainNums.toArray();

        return Arrays.toString(finalArr);

    }

    public static void main(String[] args) {
        System.out.println(newNumbers(50));

    }

}
