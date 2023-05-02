import java.util.Scanner;

public class floor {
   public static int ceiling(int arr[],int target){
    int s=0;
    int e=arr.length-1;
    while(s<e){
        int mid =s+(e-s)/2;
        if(target<arr[s]){
            return -1;
        }
        if(arr[mid]==target){
            return arr[mid];
        }
        if(arr[mid]>target){
            e=mid-1;
        }
        else{
            s=mid+1;
        }
    }
return arr[e];
   } 
   public static void main(String[] args) {
    int arr[]={1,2,5,6,7,9};
    try (Scanner sc = new Scanner(System.in)) {
        int target=sc.nextInt();
        int ans=ceiling(arr, target);
        System.out.println(ans);
    }
   }
}
