import java.util.Scanner;

public class findMinMax {
    public static  void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter number or exit if not number: ");
            String nextNumber = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextNumber);
                if (validNum < min) {
                    min = validNum;
                }
                if (validNum > max) {
                    max =validNum;
                }
                count++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (count > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");
        }

    }
}
