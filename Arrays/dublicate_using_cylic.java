import java.util.ArrayList;
import java.util.List;

public class dublicate_using_cylic {
    public static List<Integer> dublicates(int arr[]){

        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans =new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void main(String[] args) {
        int arr[]={6,5,3,2,3,2,1};

        System.out.println(dublicates(arr));
    }
    }

