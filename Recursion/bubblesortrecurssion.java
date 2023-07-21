import java.util.Arrays;

public class bubblesortrecurssion {


    public static void bubble(int arr[],int n){
        if(n==1){
            return ;
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                count=count+1;
            }
        }
        if(count==0){
            return;
        }
        bubble(arr,n-1);

    }

    public static void main(String[] args) {
        int arr[]={6,4,3,2,99,6};
       bubble(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
