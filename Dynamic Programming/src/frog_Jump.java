public class frog_Jump {
    public static int jump(int n,int arr[],int dp[]){
        if(n==0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int left=jump(n-1,arr,dp)+Math.abs(arr[n]-arr[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1){
            right=jump(n-2,arr,dp)+Math.abs(arr[n]-arr[n-2]);
        }

        return dp[n]=Math.min(left,right);
    }
    public static void main(String[] args) {

        int arr[]={10,20,30,10};
        int n=arr.length-1;
        int dp[]=new int[n+1];

        System.out.println(jump(n,arr,dp));

    }
}
