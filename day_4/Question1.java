import java.util.Scanner;
public class Question1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // System.out.println("Enter username: ");
        // String name=s.nextLine();
        int atmpt=3;
        int pin=1234;
        
        int i =0;
        while(i<=atmpt){
            System.out.print("Enter the pin: ");
            int num=s.nextInt();
            if(num==pin){
                System.out.println("Login Sucessful");
                return;
            }
            else{
                atmpt--;
                if(atmpt==0){
                    System.out.println("Login Falied");
                    return;
                }
                System.out.println("Wrong PIN "+atmpt+" Attempt left");


            }
            
            

        }
        
    }
}