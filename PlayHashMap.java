import java.util.HashMap;

public class PlayHashMap {

    public static void main(String[] args) {

        HashMap<String, Double> classGrades = new HashMap<>();
        classGrades.put("Samuel", 4.67);
        classGrades.put("David", 4.50);
        classGrades.put("Ethan", 4.20);
        classGrades.put("Nathan", 3.97);
        classGrades.put("Jason", 3.65);

        // LOOPING THROUGH A HASHMAP
        classGrades.forEach((name, grade) -> {
            System.out.printf("%s grade is %.2f \n", name, grade);

        });

        classGrades.forEach((name, grade) -> {
            classGrades.replace(name, 2 * grade);
        });

        System.out.println(classGrades.toString());

    }

}
