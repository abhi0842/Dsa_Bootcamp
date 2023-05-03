import java.util.Arrays;

public class selection_sort {

        public static void sort(int arr[]){
            for(int i=0;i<arr.length;i++){
                int last =arr.length-1-i;
                int maxindex=max(arr,0,last);

            }
        }

        public static int  max(int arr[],int first,int last){
            int max=first;

            for(int i=0;i<=last;i++){
                if(arr[max]<arr[i]){
                    max=i;
                }
            }
            return max;
        }
        public static void swap(int arr[],int start,int end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        public static void main(String[] args) {
            int arr[]={3,4,5,2,6,1};
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }

    }
