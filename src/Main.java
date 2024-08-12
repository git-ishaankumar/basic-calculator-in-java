import java.util.Scanner;

public class Main {
    static void addition(int x, int y) {
        int z = x + y;
        System.out.println(x + " + " + y + " = " + z);
    }

    static void addition(double x, double y) {
        double z = x + y;
        System.out.println(x + " + " + y + " = " + z);
    }

    static void subtraction(int x, int y) {
        int z = x - y;
        System.out.println(x + " - " + y + " = " + z);
    }

    static void subtraction(double x, double y) {
        double z = x - y;
        System.out.println(x + " - " + y + " = " + z);
    }

    static void multiplication(int x, int y) {
        int z = x * y;
        System.out.println(x + " × " + y + " = " + z);
    }

    static void multiplication(double x, double y) {
        double z = x * y;
        System.out.println(x + " × " + y + " = " + z);
    }

    static void division(int x, int y) {
        int z = x / y;
        System.out.println(x + " ÷ " + y + " = " + z);
    }

    static void division(double x, double y) {
        double z = x / y;
        System.out.println(x + " ÷ " + y + " = " + z);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a first number: ");
            String input1 = scanner.nextLine();
            double num1;

            try {
                num1 = Double.parseDouble(input1);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
                continue;
            }

            System.out.print("Enter a second number: ");
            String input2 = scanner.nextLine();
            double num2;

            try {
                num2 = Double.parseDouble(input2);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
                continue;
            }

            System.out.print("Enter an operator: ");
            String operator = scanner.nextLine();

            switch (operator) {
                case "+":
                case "➕":
                    addition(num1, num2);
                    break;
                case "-":
                case "➖":
                    subtraction(num1, num2);
                    break;
                case "*":
                case "x":
                case "×":
                case "✖":
                case "❌":
                case "❎":
                    multiplication(num1, num2);
                    break;
                case "/":
                case "÷":
                case "➗":
                    division(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator.");
            }
        }
    }
}
