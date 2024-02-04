public class adjacentsum {
    public static int sum(int n,int arr[],int dp[]){

        if(n==0){
            return arr[n];
        }
        if(n<0){
            return  0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int pick=arr[n]+sum(n-2,arr,dp);
        int notpick=0+sum(n-1,arr,dp);
        return dp[n]=Math.max(pick,notpick);
    }
    public static int spacesum(int arr[]){
        int n=arr.length;
        int pre1=arr[0];
        int pre2=0;
        for(int i=0;i<n;i++){
            int take=arr[i];
            if(i>1){
                take+=pre1;
            }
            int nottake=0+pre2;
            int curr=Math.max(take,nottake);

            pre2=pre1;
            pre1=curr;
        }
        return pre1;
    }


    public static void main(String[] args) {
        int arr[]={2,1,4,9};
        int n=arr.length-1;
        int dp[]=new int [n+1];

        System.out.println(sum(n,arr,dp));
    }
}
