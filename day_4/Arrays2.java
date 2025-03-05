
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args){
        int[] arr1=new int[5];
        int[] arr2=new int[5];
        Scanner sc=new Scanner(System.in);
                for(int i=0;i<5;i++){
            System.out.print("Array1 element "+(i+1)+": ");
            arr1[i]=sc.nextInt();

        }
        for(int i=0;i<5;i++){
            System.out.print("Array2 element "+(i+1)+": ");
            arr2[i]=sc.nextInt();

        }
        for(int i =0;i<5;i++){
            if(arr1[i]==arr2[i]){
                continue;
            }
            else{
                System.out.println("Both arrays are not eequal");
            }
            System.out.println("Both arrays are equal");
        }
    }
}
