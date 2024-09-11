
class Main {
    static String username = "Elmagnifico";

    static String compareNums(int num1, int num2) {
        if (num1 > num2) {
            return "The number " + num1 + " is greater than " + num2;

        } else if (num2 > num1) {
            return "The number " + num2 + " is greater than " + num1;

        }
        return "Both numbers are Equal ";

    }

    static int sumNums(int val1, int val2) {
        return val1 + val2;
    }

    public static void main(String[] args) {
        int age = 29;
        String name;
        name = "Samuel";
        age += 5;
        String upperCaseName = name.toUpperCase();

        double num1 = 100;
        double num2 = 17;
        double result = num1 / num2;
        boolean isActive = false;

        // int inputNum1 = 58;
        // int inputNum2 = 60;

        String formattedString = String.format("My name is %s, I am %s years old. My final result is %.2f", name, age,
                result);
        // System.out.println("The dividend is " + result);
        // System.out.println(name + " is " + age + " years old");
        // System.out.println("The username " + username + " has been banned from the
        // website");
        // System.out.println(compareNums(inputNum1, inputNum2));
        // System.out.println(sumNums(inputNum1, inputNum2));
        System.out.println(formattedString);
        System.out.println(upperCaseName);
        System.out.println(isActive);
    }
}
