import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        System.out.println("Enter a string of text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Enter an integer:");
        int intValue = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a double:");
        double doubValue = scanner.nextDouble();
        System.out.println("Enter a boolean value:");
        boolean boolValue = scanner.nextBoolean();

        System.out.println("Your string is "+ text);
        System.out.println("Your integer is " + intValue);
        System.out.println("Your double is " + doubValue);
        System.out.println("Your boolean is " + boolValue);

    }
}
