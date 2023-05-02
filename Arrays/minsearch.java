public class minsearch {
    public static int search(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
          if(arr[i]<max){
            max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={5,2,4,1,2,8,3,5};
        int ans =search(arr);
        System.out.println(ans);
    }
}
