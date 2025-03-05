import java.util.Arrays;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size  array: ");
    int n=sc.nextInt();
    
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        System.out.print("Array1 element "+(i+1)+": ");
        arr[i]=sc.nextInt();
    }
        Arrays.sort(arr);
        System.out.println("Largest number is :"+arr[n-1]);

    
}
}
