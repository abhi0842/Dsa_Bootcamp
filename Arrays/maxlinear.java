public class maxlinear {
    public static int search(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,82,5,7};
        int ans =search(arr);
        System.out.println(ans);
    }
}
