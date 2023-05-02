public class swapalernate {
   public static void main(String[] args) {
    int arr[]={1,23,4,5,5,4};
    int n=arr.length;
    for(int i=0;i<n-1;i+=2){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
   

   } 
}
