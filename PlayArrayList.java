import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayArrayList {

    public static void main(String[] args) {

        // CREATING AN ARRAY LIST
        ArrayList<Integer> numArrays = new ArrayList<Integer>();

        System.out.println("initial contents of numArrays " + numArrays);
        System.out.println("initial size of numArrays " + numArrays.size());

        numArrays.add(5);
        numArrays.add(3);
        numArrays.add(4);
        numArrays.add(7);
        numArrays.add(3);

        // ADDING AN ARRAY TO AN ARRRAY LIST
        int[] recentNums = new int[] { 10, 73, 92, 85, 10, 20 };

        // ADDING ARRAY TO ARRAYLIST: to do this, you nust use the new Integer keyword
        // and loop through. However for Strings, its not the same
        for (int num : recentNums) {
            numArrays.add(Integer.valueOf(num));

        }

        numArrays.forEach(num -> {
            numArrays.set(numArrays.indexOf(num), num * 3);
        });

        System.out.println("contents of numArrays after adding" + numArrays);
        System.out.println("size of numArrays after adding " + numArrays.size());

        // numArrays.remove(2);

        System.out.println("contents of numArrays after removing" + numArrays);
        System.out.println("size of numArrays after removing " + numArrays.size());

        System.out.println("initial contents of numArrays " + numArrays);
        System.out.println("initial size of numArrays " + numArrays.size());

        ArrayList<String> userNames = new ArrayList<String>();

        System.out.println("initial contents of userNames " + userNames);
        System.out.println("initial size of userNames " + userNames.size());

        userNames.add("Samuel");
        userNames.add("Elmagnifico");
        userNames.add("Jason");

        // ADDING STRING ARRAY TO ARRAYLIST
        String[] extraNames = new String[] { "Daniel", "Francis", "Fredrick" };
        List<String> moreNames = new ArrayList<String>(Arrays.asList(extraNames));

        userNames.addAll(moreNames);
        userNames.forEach(name -> {
            System.out.println(name);
        });

        System.out.println(userNames.getClass());// SIMILAR TO TYPEOF IN JAVASCRIPT.
        System.out.println("contents of userNames " + userNames.toString());
        System.out.println("size of userNames " + userNames.size());

    }

}
