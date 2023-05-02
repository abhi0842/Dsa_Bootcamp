import java.util.Scanner;

public class largestchar {
    public static  char chara(char[]arr, char target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
           
        }
        return arr[s%arr.length];

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        char[] arr={'a','b','d','e'};
        char target='f';
        System.out.println(chara(arr, target));
    }
    
}
