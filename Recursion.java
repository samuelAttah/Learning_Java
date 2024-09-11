public class Recursion {

    public static int sumRange(int a, int b) {
        if (a == b) {
            return a;
        }
        return a + sumRange(a + 1, b);
    }

    public static int facto(int num) {
        if (num == 1) {
            return num;
        }
        return num * facto(num - 1);
    }

    // public static int[] ranger()

    public static void main(String[] args) {

        System.out.printf("The sum of numbers between %d and %d is: %d \n", 3, 8, sumRange(3, 8));
        System.out.printf("The factorial of %d is %d", 3, facto(6));

    }

}
