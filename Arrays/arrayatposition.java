import java.util.Scanner;

public class arrayatposition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the element in the array");
    int n = sc.nextInt();
    int [] arr =new int[n];
System.out.println("enter the element");
for(int i=0; i<arr.length;i++){
    arr[i]=sc.nextInt();
}
System.out.println("the element of array");
for(int j=0;j<arr.length;j++){
    System.out.println(arr[j]);
}  
  }
}
