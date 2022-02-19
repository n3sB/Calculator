import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1, number2, select;

        System.out.print("Please enter the first number: ");
        number1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        number2 = scanner.nextInt();

        System.out.println("*****       ******");

        System.out.println("1-Addition\n2-Extraction\n3-Division\n4-Multiplication");

        System.out.print("Choose: ");
        select = scanner.nextInt();
        scanner.close();

        switch (select) {

            case 1:
                System.out.println("Addition: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Extraction: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Division: " + (number1 / number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.println("A number cannot be divided by 0.");
                } else {
                    System.out.println("Multiplication: " + (number1 * number2));
                }
                break;
            default:
                System.out.println("Invalic choice. Please try again.");
        }

    }
}
