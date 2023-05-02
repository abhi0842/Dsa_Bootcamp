public class firstandlast {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4,5,5,6};
        int target=3;
        int ans[]={-1,-1};
        int start=search(arr, target, true);
        int end=search(arr, target, false);
       ans[0]=start;
       ans[1]=end;
       System.out.print(ans[0]+" ");
       System.out.println(ans[1]);
       
    }
    public static int search(int arr[],int target,boolean firstindex){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
        else{
            ans=mid;
            if(firstindex){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
            
        }
        return ans;
            }
}
