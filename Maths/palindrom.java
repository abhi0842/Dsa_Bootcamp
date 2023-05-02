public class palindrom {
    public static void main(String[] args) {
        int n=131;
        ispalin(n);
        
    }
    public static void ispalin(int n){
        int sum=0;
        int temp=n;
        while(n>0){
            int rem =n%10;
            sum=sum*10+rem;
            n=n/10;
        }
            if(sum==temp){
                System.out.println("is palindrom ");
            }else{ System.out.println(" is not palindrom");}
        
    }
    
}
