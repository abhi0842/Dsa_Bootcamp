public class pascaltriangle {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<n;i++){

            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                if(k==0||k==n-1){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
