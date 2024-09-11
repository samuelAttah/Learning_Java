import java.awt.Color;
import java.util.Arrays;

public class PlayArrays {

    static void printVowels(String[] myVowel) {
        for (int i = 0; i < myVowel.length; i++) {
            System.out.println(myVowel[i]);
        }

    }

    public static void main(String[] args) {
        // DECLARING ARRAYS
        String[] nameArrays = new String[5];
        nameArrays[0] = "Samuel";
        nameArrays[1] = "Daniel";
        nameArrays[2] = "Chuks";
        nameArrays[3] = "David";
        nameArrays[4] = "Fabian";

        System.out.println(nameArrays.length);

        int[] evenNums = { 2, 4, 6, 8, 10 };

        System.out.println(evenNums.length);

        // DECLARING AND INITIALIZING ARRAYS
        Color[] pallette = { Color.BLACK, Color.red, Color.CYAN };

        System.out.println(pallette[1]);

        // ASSIGNING VALUE TO AN ALREADY DECLARED ARRAY
        String[] cities = new String[4];

        cities = new String[] { "Tokyo", "New York", "Harare", "Lagos" };

        // LOOPING THROUGH ARRAYS
        for (int i = 0; i < pallette.length; i++) {
            System.out.println(pallette[i]);
        }

        // CONVERTING ARRAY TO STRING AND PRINTING OUT TO SCREEN
        System.out.println(Arrays.toString(cities));

        // TAKING AN ARRAY AS A PARAMETER IN A METHOD
        printVowels(new String[] { "a", "e", "i", "o", "u" });

        // SORTING ARRAYS
        int[] oddNums = new int[] { 7, 9, 5, 1, 3 };

        Arrays.sort(oddNums);
        System.out.println(Arrays.toString(oddNums));

        // SEARCHING ARRAYS
        int foundElementIndex = Arrays.binarySearch(oddNums, 7);
        System.out.println(foundElementIndex);

        // FILLING ARRAYS
        Arrays.fill(nameArrays, "X");
        System.out.println(Arrays.toString(nameArrays));

        // COPYING AN ARRAY. n/b avoid copying with an assignment operator =, as this
        // will
        // only hold a reference to the original array.
        int[] copyOfOddNums = Arrays.copyOf(oddNums, oddNums.length);

        System.out.println(Arrays.toString(copyOfOddNums));

        int twoD[][] = new int[4][5];

        System.out.println(twoD.length);

        // MULTIDIMENSIONAL ARRAYS
        int[][] multiArray = new int[][] { { 2, 3, 4 }, { 5, 6, 7 } };
        // for(int i=0; )

    }

}
