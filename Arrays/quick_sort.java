import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
int arr[]={2,1,5,4,7,6,3};
quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[]arr,int lo,int hi){
        if(lo>=hi){
            return;
        }
        int s=lo;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot =arr[m];
         while(s<=e){
              while(arr[s]<pivot){
                  s++;
              }
              while(arr[e]>pivot){
                  e--;
              }
                if(s<=e){
                   int temp=arr[s];
                  arr[s]=arr[e];
                  arr[e]=temp;
                  s++;
                  e--;
              }
        }
        quick(arr,lo,e);
        quick(arr,s,hi);
    }
}
