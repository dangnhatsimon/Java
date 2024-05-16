import java.util.Scanner;

public class readUserInput {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        double sum = 0;
        while (count <= 5) {
            System.out.println("Enter number #" + count + ": ");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                sum += number;
                count++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }
        System.out.println("The sum of the 5 numbers = " + sum);
    }
}
