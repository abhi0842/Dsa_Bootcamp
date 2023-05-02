/*import java.util.ArrayList;
import java.util.Scanner;
public class list{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     // ArrayList<Integer> list = new ArrayList<>(5);
      list.add (34) ;
      list.add(12);
     System.out.println( list.contains(12));
      System.out.println(list);
      ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
      for (int i=0;i<3;i++){
        list1.add(new ArrayList<>());
      }
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            list1.get(i).add(sc.nextInt());
        }
      }
      System.out.println(list1);
    }
} 
public class list{
    public static  void swap(int arr [],int index1,int index2){

   int temp = arr[index1];
   arr[index1]=arr[index2];
  arr [index2]=temp;

    }
    public static void main(String[] args) {
        int [] arr = {1,23,4,5,6,7,8,};
        swap(arr,2,3);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
public class list{
    public static int max(int []arr,int start,int end ){
        int maxvalue =arr[0];
        
        for (int i=start;i<=end;i++){
            if(arr[i]>maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue; 

    }
    public static void main(String[] args) {
        int arr []= {1,2,3,4,3,25};
System.out.println(max(arr,0,5));
    }
}
import java.util.Scanner;
public class list{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                if(i==n||j==1||j==i){
                    System.out.print("*");
                }
                    else{
                        System.out.print(" ");
                    }
                    
                }
            
System.out.println();
        }
    }
}import java.util.Scanner;
public class list{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
      import java.util.Scanner;
      public class list{
        public static void main(String[] args) {
           Scanner sc =new Scanner(System.in);
           int n = sc.nextInt();
           
           for(int i = 0;i<n;i++){
           for(int j=0;j<i;j++){
              System.out.print(" "); 
             }
           for(int k=0;k< 2*(n-i)-1;k++){
             System.out.print("*");
              }
              System.out.println();
           }
           for(int i=0;i<n;i++){
            for(int j =0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                if(k==1||k==i||i==n){
                    System.out.print("*");
                }
                
            }
            System.out.println();
           }
        }
      }
    */
     public class list {
        public static void main(String[] args) {
            int n= 5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j =1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
     }