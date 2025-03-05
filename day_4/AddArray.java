public class AddArray {
    public static void main(String[] args){
        int[] arr={1,2,5,2,3};
        int n=arr.length;
        int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    System.out.println("Total sum of array is :"+sum);
    }
}

