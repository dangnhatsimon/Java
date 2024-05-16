public class sumDigits {
    public static void main(String[] args) {
        System.out.println("Sum of all digits of 125 is " + sumDigits(125));
        System.out.println("Sum of all digits of 1000 is " + sumDigits(1000));
    }
    public static int sumDigits(int num) {
        int sum = 0;
        if (num < 0) {
            return -1;
        } else {
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            return sum;
        }
    }
}
