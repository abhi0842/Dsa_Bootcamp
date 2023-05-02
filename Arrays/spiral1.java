import java.util.ArrayList;
import java.util.List;

class spiral1{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        int arr[][]={{1,4,5},
                   {3,4,6},
                   {76,46,3}};
                   int start=0;
                   int end=arr[0].length-1;
                   int top=0;
                   int bottom=arr.length-1;
                   while(start<=end||top<=bottom){
                    for(int i=start;i<=end;i++){
                        list.add(arr[top][i]);
                    }
                    top++;
                    for(int i=top;i<=bottom;i++){
                        list.add(arr[i][end]);
                    }
                    end--;
                    if(top<bottom){
                        for(int i=end;i>=start;i--){
                            list.add(arr[bottom][i]);
                        }
                    }
                    bottom--;
                   if(start<nend){
                    for(int i=bottom;i>=top;i--){
                        list.add(arr[i][start]);
                    }
                   }
                    start++;
                   }
                   System.out.println(list);
    }
}