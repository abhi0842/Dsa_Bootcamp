import java.util.Scanner;

public class Two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={2,7,11,15};
        System.out.println("enter the target number");
        int target= sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(target==arr[i]+arr[j]){
                    System.out.println("target cis present in array");
                }
               
               
               
            }
        }
       
    }
}
