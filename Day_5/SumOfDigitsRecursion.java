public class SumOfDigitsRecursion {
    // Recursive method to calculate sum of digits
    public static int sumOfDigits(int num) {
        if (num == 0)
            return 0;
        return (num % 10) + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        int number = 12345; // Example number
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
