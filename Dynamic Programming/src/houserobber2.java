public class houserobber2 {
    public static int spacesum(int arr[]){
        int n=arr.length;
        int pre1=arr[0];
        int pre2=0;
        for(int i=1;i<n;i++){
            int take=arr[i];
            if(i>1) take+=pre2;
                int nottake=0+pre1;


            int curr=Math.max(take,nottake);

            pre2=pre1;
            pre1=curr;
        }
        return pre1;
    }
    public static int houserobber(int arr[]){

        int n=arr.length;
     if(n==1){
       return arr[0];
        }
        int arr1[]=new int [n];
        int arr2[]=new int [n];
        for(int i=0;i<n;i++){
            if(i!=0){
                arr1[i]=arr[i];

            }
            if(i!=n-1){
                arr2[i]=arr[i];
            }
        }
        return Math.max(spacesum(arr1),spacesum(arr2));
    }
    public static void main(String[] args) {
     int arr[]={1,3,2,1};
        System.out.println(houserobber(arr));
    }

}
