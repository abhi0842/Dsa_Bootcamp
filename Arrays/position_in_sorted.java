public class position_in_sorted {
    public static int sortedinfinite(int arr[],int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return  binaryseach(arr,target,start,end);
    }
    public static int binaryseach(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int []arr={1,2,3,4,5,8,9,14,15,17,18 }  ;
      int target=14;
      System.out.println(sortedinfinite(arr, target));
    }
}
