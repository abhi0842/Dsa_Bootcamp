import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonaccidp {
    public static int fibb(int n,int arr[]){
        if(arr[n]!=0){
            return arr[n];
        }

        if(n==0||n==1){
            return n;
        }

        return arr[n]=fibb(n-1,arr)+fibb(n-2,arr);
    }
    public static void main(String[] args) {
int n=100;
        int arr[]=new int[n+1];

        for(int i=0;i<=n;i++){
            System.out.println(fibb(i,arr));
        }
    }
}
