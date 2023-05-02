public class duplicate{
    public static int array(int []arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
                System.out.println(arr[j]);
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,2,4,5,5,6,6,6,7};
        System.out.println(array(arr));
        
    }
}
