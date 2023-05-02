public class hollow {
    public static void main(String[] args) {
        int  n = 5;
       /* for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=n-i+1;j++){
                if(j==1||j==n-i+1||i==1){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                if(i==n){
                System.out.print("*");}
                else{
                    if(j==1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                   
                }
            }
            for(int j=1;j<i;j++){
                if(j==i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
