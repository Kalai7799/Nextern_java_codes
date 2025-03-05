public class FibonacciRecursion {
    
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Series (1 to 20 terms):");
        for (int i = 1; i <= 20; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
