import java.util.Scanner;

public class primenum {
    public static boolean isprime(int n){
       if(n<=1){
        return false;
       }
    //    for(int c=2;c*c<=n;c++){
    //     if(n%c==0){
    //         return false;
    //     }
       
    //    }
    //    return true;
    // }
    int c=2;
    while(c*c<=n){
      if(n%c==0){
       
        return false;
      }
      c++;
    }
    return true;
    }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n=sc.nextInt();
System.out.println(isprime(n));
    }
  }  
}
