 import java.util.*;
 public class reversenumber {
    public static void main(String[] args) {
    //     int n=1234;
    //     int count=0;
    //     while(n>0){
    //         count =count*10+n%10;
    //         n=n/10;
    //     }
    //     System.out.println(count);
    // 
    int []   arr={1,23,4,56,6,7 };
       swap(arr,1,3);
       //reverse(arr);
       System.out.println(Arrays.toString(arr));
    }
    // public static void reverse(int[]arr){
    //     int start =0;
    //     int end=arr.length-1;
    //     while(start<end){
    //         swap(arr,start,end);
    //         start++;
    //         end--;
    //     }
    // }
    public static void swap(int[]arr,int index1,int index2){
        int temp =arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
}

}
