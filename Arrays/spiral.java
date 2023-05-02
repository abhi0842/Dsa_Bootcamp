import java.util.*;
public class spiral {
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list =new ArrayList<>();
        
        int top=0;
        int bottom=matrix.length-1;
        int start=0;
        int end =matrix[0].length-1;
        while(top<=bottom&&start<=end){
            for(int i=start;i<=end;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][end]);
            }
            end--;
            if(top<=end){
                for(int i=end;i>=start;i--){
                    list.add(matrix[bottom][i]);
                }
            }
                bottom--;
                if(start<=end){
                    for(int i=bottom;i>=top;i--){
                        list.add(matrix[i][start]);
                    }
                }
                start++;
        }
      System.out.println(list);
    }
}
