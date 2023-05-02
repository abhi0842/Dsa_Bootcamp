import java.util.Arrays;

public class reverse {
    public static void reverses(int arr[]){
        System.out.println(Arrays.toString(arr));
        int n=arr.length/2;
        int end = arr.length-1;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[end-i];
            arr[end-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
       int [] array={1,2,3,5,6};
       reverses(array);

    }
}
