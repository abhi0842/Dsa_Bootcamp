public class binarysearchrecurssion {
    public static int search(int arr[],int start ,int end,int target){
        if(arr.length==1){
            return arr[0];
        }
        int mid =start+(end -start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return search(arr,mid+1,end,target);
        }
        if(arr[mid]>target){
            return search(arr,start,mid-1,target);
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7,8,9,66,88};
        System.out.println(search(arr,0,arr.length-1,66));
    }
}
