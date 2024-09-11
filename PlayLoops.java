public class PlayLoops {

    public static void main(String[] args) {
        // A CODE TO PRINT OUT ALL ODD NUMS BETWEEN 1 AND 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d is an odd number \n", i);
            }
        }

        int[] numbers = { 1, 2, 3, 4, 5 };

        // ANOTHER WAY OF DOING FOR LOOP
        for (int num : numbers) {
            System.out.println(num);
        }

        // WHILE LOOPS
        int refNum = 5;
        while (refNum > 0) {
            System.out.println("Hello world");
            refNum--;
        }

        // DO WHILE LOOPS
        int newRef = 0;
        do {
            System.out.println("Welcome to Manchester United Mathis");
            newRef--;
        } while (newRef > 0);

    }

}
