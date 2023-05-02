import java.util.Arrays;

public class bubble {
    public static void sort(int arr[]){
        boolean swap;
        for(int i=0;i<=arr.length-1;i++){
            swap =false;
            for(int j=1;j<=arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap =true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,56};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
 