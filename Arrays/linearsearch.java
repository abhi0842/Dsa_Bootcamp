public class linearsearch{
    public static int search(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,45,6,78,9,};
        int a=search(arr, 45);
        System.out.println(a);
    }
}