import java.util.Arrays;

public class trianglesum {
    public static void sum(int []arr){
        if(arr.length<1){
            return;
        }
        int n=arr.length;
        int newarray[]=new int[arr.length-1];
        for(int i=0;i<n-1;i++){
            int temp=arr[i]+arr[i+1];
               newarray[i]=temp;
        }System.out.println(Arrays.toString(arr));

        sum(newarray);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
    sum(arr);
    }
}
