import java.util.Scanner;

public class fibbonacciTabulation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pre1=0;
        int pre2=1;
        int curr;
        System.out.print(pre1+" "+pre2+" ");
        for(int i=2;i<=n;i++){
            curr=pre1+pre2;
            System.out.print(curr+" ");
            pre1=pre2;
            pre2=curr;

        }

    }
}
