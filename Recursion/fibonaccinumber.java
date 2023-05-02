
public class fibonaccinumber {
    public static int fibonacci(int n){
        int num1,num2, sum=0;
        num1=0;
        num2=1;
System.out.print(num1+" "+num2);
        for(int i=2;i<=n;i++){
            sum =num1+num2;
            System.out.print(" "+sum);
           num1=num2;
           num2=sum;
        
        }System.out.println();
        return sum;
    }
    public static void main(String[] args) {
       int ans= fibonacci(4);
        System.out.println(ans);
    }
}
