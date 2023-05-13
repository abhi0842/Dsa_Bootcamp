import java.sql.Array;
import java.util.ArrayList;

public class Stringsubseqlist {
    public static ArrayList<String> Subseq(String p,String up){
        if(up.isEmpty()){
        ArrayList<String> list =new ArrayList<>();
        list.add(p);
        return list;
        }
        char ch =up.charAt(0);
        ArrayList<String> left =Subseq(p+ch,up.substring(1));
         ArrayList<String> right =Subseq(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        System.out.println(Subseq("","abc"));
    }
}
