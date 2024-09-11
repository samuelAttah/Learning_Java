import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This calculator gets the sum of two numbers you supply\n First Number: ");

        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.println(
                "Operation to be performed (hint:* for multiplication, + for addition, - for subtraction, / for division, % for modulus): ");

        String operation = scanner.nextLine();

        System.out.println("Second Number: ");

        double num2 = Double.parseDouble(scanner.nextLine());

        if (operation.equals("*")) {

            System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 * num2);

        } else if (operation.equals("+")) {

            System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);

        } else if (operation.equals("-")) {

            System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);

        } else if (operation.equals("/")) {
            double dividend = num1 / num2;
            System.out.printf("%.2f / %.2f = %.2f", num1, num2, dividend);

        } else if (operation.equals("%")) {

            System.out.printf("%.2f %s %.2f = %.2f", num1, "%", num2, num1 % num2);

        } else {
            System.out.printf("%s is an invalid operation", operation);
        }

        // String computerResponse = String.format("The Sum is %.2f", sum);

        // System.out.println(computerResponse);

        scanner.close();

    }

}
