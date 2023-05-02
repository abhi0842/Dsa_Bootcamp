public class binearyusingricurussion {
   public static int binary(int []arr,int target,int s, int e){
       
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]<target){
            return  binary(arr,target,m+1,e);
        }
        if(arr[m]>target){
            return binary(arr,target,s,m-1);
        }
        return m;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,53,54,55};
        int s=0;
        int e=arr.length-1;
        int target=5;
        binary(arr, target, s, e);

    }
}
