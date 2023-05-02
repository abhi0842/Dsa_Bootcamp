

public class arrayswap {
    public static void swap(int arr[],int index,int index2){
        int temp=arr[index];
        arr[index]=arr[index2]; 
        arr[index2]=temp;
    }
    public static int  reverse(int arr[]){
        int end =arr.length-1;
       int start =0;
       while(start<end){
        swap(arr, start, end);
        start++;
        end --;
       }
    return start;
      
    }
    public static void main(String[] args) {
       int arr[]={1,2,34,5,5};
      // swap(arr, 1,4);
     
System.out.println((reverse(arr)));
    }
}
