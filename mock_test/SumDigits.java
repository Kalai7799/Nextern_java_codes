public class SumDigits{
    static int sumof(int n){
        if(n==0){
            return 0;
        }
        return(n%10+sumof(n/10));
    }
    public static void main(String[] args) {
        int num=1234;
        System.out.println(sumof(num));
    }
}