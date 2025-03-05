import java.util.Scanner;

public class Palindrome {
    static String ispalindrome(String s){
        int l=s.length();
        if(s.length()==0){
            return "";
        }
        return(ispalindrome(s.substring(1))+s.charAt(0));
    }
    public static void main(String[] args) {
        System.out.println("Enter a string to check for palindrome: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(ispalindrome(str).equals(str)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
