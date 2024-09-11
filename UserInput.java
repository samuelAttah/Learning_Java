import java.util.Scanner;

public class UserInput {
    // static String userName = "Elmagnifico";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kindly Input your username");

        String userName = scanner.nextLine();

        String computerResponse = String.format("your username is %s", userName);

        System.out.println(computerResponse);

        scanner.close();

    }

}
