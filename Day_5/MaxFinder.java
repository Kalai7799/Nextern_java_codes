public class MaxFinder {
    public static int findMax(int a, int b) {
        return (a > b) ? a : b; 
    }

    public static void main(String args[]) {
        int num1 = 10, num2 = 25; 
        int max = findMax(num1, num2); 
        System.out.println("The maximum number is: " + max); 
    }
}