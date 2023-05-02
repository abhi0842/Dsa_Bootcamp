
import java.util.Scanner;
public class armstrong{
    public static boolean isarm(int n){
        int sum =0;
        int temp=n;
        while(n>0){
        int rem =n%10;
        sum =sum +rem*rem*rem;
        n=n/10;

        }
        return (temp==sum);
   }
   public static void main(String[] args) {
   try (Scanner sc = new Scanner(System.in)) {
    int n =sc.nextInt();
       System.out.println(isarm(n));
}
   }

}