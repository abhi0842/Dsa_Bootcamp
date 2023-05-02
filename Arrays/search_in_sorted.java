public class search_in_sorted {
    public static int search(int arr[],int target,int start,int end){
        while(start<=end){
         int mid=start+(end-start)/2;
         if(arr[mid]<target){
            start=mid+1;
         }
         else if(arr[mid]>target){
            end=mid-1;

         }
         else{
            return arr[mid];
         }
        }
        return -1;
    }
    public static int length(int arr[],int target){
         int start=0;
         int end=1;
         while(arr[end]<target){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
           
         }
         return search(arr, target, start, end);
    }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
    int target=11;
    
    int ans=length(arr, target);
    System.out.println(ans);
  }  
}
