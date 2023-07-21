import java.sql.SQLOutput;

public class printnumberrecurssion {
    public static void main(String[] args) {
        print(1,10);
    }
    public static void print(int n,int u){
        if(n==u){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1,u);

    }
}
