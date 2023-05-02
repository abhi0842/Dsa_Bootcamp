public class agnosticebinary {
    public static int binary(int []arr,int target){
        int start =0;
        int end=arr.length-1;
        boolean isacen=arr[start]<arr[end];
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isacen){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
  public static void main(String[] args) {
    int arr[]={9,7,6,5,4,3,2};
    int target=7;
    int ans=binary(arr,target);
    System.out.println(ans);
  }  
}
