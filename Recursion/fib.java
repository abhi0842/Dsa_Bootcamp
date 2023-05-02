public class fib {
    public static void main(String[] args) {
        System.out.println(fibb(6));
    }
    public static int fibb(int n){
        if(n==0||n==1){
            
            return n;
        }
    int a=fibb(n-1)+fibb(n-2);
        return a;
    }
}
        