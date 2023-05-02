import java.util.Arrays;

public class linearsearch2d {
    public static int[] search(int arr[][],int target){
        
       for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
        }
       }
       return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[][]={{1,34,56},
                    {64,76,85},
                     {13,5,6,}};
        int[] a=search(arr, 85);
        System.out.println(Arrays.toString(a));
    }
}
