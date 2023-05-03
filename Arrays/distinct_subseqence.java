import java.util.HashMap;
import java.util.Scanner;

public class distinct_subseqence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
       long []dp = new long [str.length()];
         dp[0]=1;
        HashMap<Character,Integer> map=new HashMap<>();
   for(int i=1;i<str.length();i++){
       dp[i]=2*dp[i-1];
       char ch =str.charAt(i-1);
       if(map.containsKey(ch)){
           int j=map.get(ch);
           dp[i]=dp[i]-dp[j-1];
       }
       map.put(ch,i);
   }
        System.out.println(dp[str.length()-1]);
    }
}
