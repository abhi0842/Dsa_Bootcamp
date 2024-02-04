public class stocksell {
    public static int profit(int [] prices,int ind,boolean buy,int n){
        if(ind==prices.length){
            return 0;
        }
        int profit=0;
        if(buy){
             profit=Math.max(-prices[ind]+profit(prices,ind+1,false,n),(0+profit(prices,ind+1,true,n)));

        }
        else{
            profit=Math.max(prices[ind]+profit(prices,ind+1,true,n),0+profit(prices,ind+1,false,n));
        }
        return profit;
    }
    public static void main(String args[]){ 
         int arr[]={7,1,5,3,6,4};
         int n=arr.length;
        System.out.println(profit(arr,0,true ,n));
    }
}
