

public class modulo {
public static boolean printprime(int n){
    if(n<=1){
        return false;
    }
   
for(int i=2;i*i<=n;i++){
    if(n%i==0){
        return false; 
    }
    
    }
   return true;
}
public static void main(String[] args) {
    for(int i=0;i<10;i++){
        if(printprime(i)){
            System.out.println(i); 
        }
        }
       
   
}
}
