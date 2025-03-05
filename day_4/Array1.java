public class Array1 {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,3,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("using for each");
        for (int i : arr) {
            System.out.println(i);
            
        }
    }
}
