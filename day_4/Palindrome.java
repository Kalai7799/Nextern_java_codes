
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("Enter input: ");
        Scanner s=new Scanner(System.in);
        String str2=s.nextLine();
        int n=str2.length();
        
        for (int i = 0; i < n/2; i++) {
            if(str2.charAt(i)==str2.charAt(n-i-1)){
                continue;
            }
            else{
                System.out.println("Not a palindrome");
                return;

            }
            
        }
        System.out.println("Palindrome");
    }
    }

