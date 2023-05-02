public class rotate_array {
   public static int peak(int arr[]){
    int start =0;
    int end=arr.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(mid<end&&arr[mid]>arr[mid+1]){
            return mid;
        }
        if(mid>start&&arr[mid-1]>arr[mid]){
            return mid-1;
        }
        if(arr[mid]>=arr[start]){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
      
    }
    return -1;
   }
   public static int binearysearch(int arr[],int target,int start,int end){
    while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]<target){
            start=mid+1;
        }
        else if(arr[mid]>target){
            end=mid-1;
        }
        else{
            return mid;
        }
    }
    return -1;
   }
   public static int search(int arr[],int target){
    int peek=peak(arr);
    if(arr[peek]==-1){
        return binearysearch(arr, target, 0, arr.length-1);
    }
    if(arr[peek]==target){
        return peek;
    }
    if(target>arr[0]){
        return binearysearch(arr, target, 0, peek-1);
    }
    return binearysearch(arr, target, peek+1, arr.length-1);
   }
   public static void main(String[] args) {
    int arr[]={4,5,6,7,3,2,1};
    System.out.println(peak(arr));
    System.out.println(search(arr, 2 ));
   }
}
