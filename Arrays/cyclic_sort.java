import java.util.Arrays;

public class cyclic_sort {
    public static void sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=correct){
                swap(arr,i,correct);
            }
        }
    }
    public static void swap(int arr[],int start,int end){
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
int arr[]={4,3,5,2,1};
sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
