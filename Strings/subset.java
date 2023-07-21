import java.util.ArrayList;
import java.util.List;

public class subset{
    public static void main(String[] args) {
int arr[]={1,2,3};
List<List<Integer>> ans =sub(arr);
for(List<Integer> list :ans){
            System.out.println(list);
        }
    }
    public static  List<List<Integer>> sub(int arr[]){
        //this outer list is used to hold the subset
        List<List<Integer>> outer =new ArrayList<>();
     // this is used to add the empty set in the arraylist
       outer.add(new ArrayList<>());
        for(int num:arr){
        int n=outer.size();
        for(int i=0;i<n;i++){
            //now we take the copy of previous suset and add the new element in it to make the more subset
             List<Integer> internal =new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
        }
        }
        return outer;
    }
}

