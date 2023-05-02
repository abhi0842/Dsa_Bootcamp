public class printnum {
    // public static int print(int n){
    //     if(n==5){
    //         return 5;
           
    //     }
    //     System.out.println(n);
    //  return print(n+1);
    // }
    public static int print(int n){
        if(n==1){
            return 1;
        }
        System.out.println(n);
        return print(n-1);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(print(n));
    }
}
