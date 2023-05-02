class ceilingofarray{
    public static int ceiling(int arr[],int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(arr[mid]<target){
                if(target>arr[arr.length-1]){
                    return -1;
                }
                s=mid+1;
            }
            else{
                e=mid -1;
            }
        } 
        return arr[s];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,10};
        int ans=ceiling(arr, 7);
        System.out.println(ans);
    }
}