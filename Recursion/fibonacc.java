

public class fibonacc {
//     public static int fibonacci(int n){
//         int num1,num2, sum=0;
//         num1=0;
//         num2=1;
// System.out.print(num1+" "+num2);
//         for(int i=2;i<=n;i++){
//             sum =num1+num2;
//             System.out.print(" "+sum);
//            num1=num2;
//            num2=sum;
        
//         }System.out.println();
//         return sum;
//     }
public static int fibbonac(int n){
    if(n<=1){
        return n;
    }
    int fib=(fibbonac(n-1)+fibbonac(n-2));
  
    return fib ;
}
    public static void main(String[] args) {
       int ans=fibbonac(10);
        System.out.println(ans);
    }
}
