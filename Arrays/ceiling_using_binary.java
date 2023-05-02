public class ceiling_using_binary {
    public static int search(int arr[]){
        int n=arr.length;
        int start =0;
        int end =n;
       
        int target=4;
       while(start<end){
        int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start =mid+1;
            }
            else{
                return mid;
            }
            
        }
       return start;
    }
    public static void main(String[] args) {
       int arr[] ={3,4,5,7,8,12,14,56};
       int a=search(arr);
       System.out.println(a);
    }
}
