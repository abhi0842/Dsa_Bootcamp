import java.sql.SQLOutput;

public class printnumberusingrecurssion {
    public static void print(int N){
        if(N==1){
            System.out.println(N);
            return;
        }

        print(N-1);
        System.out.println(N);
    }
    public static void main(String[] args) {
        int n=10;
        print(n);
    }
}
