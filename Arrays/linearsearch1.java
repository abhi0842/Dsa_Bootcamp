public class linearsearch1 {
    public static int search(int arr[][]){
        int min=Integer.MAX_VALUE;
        if(arr.length==0){
            return -1;
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
    int [][] arr={{3,4,67,7},{5,6,1},{7,8,9}};
    System.out.println(search(arr));
    }
}
