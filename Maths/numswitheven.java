import javax.naming.directory.SearchControls;

public class numswitheven {
    public static int even(int []nums){
        int count =0;
     for(int num:nums){
     if(num%2==0){
        count++;
     }
}
return count;
    }
    public static void main(String[] args) {
       int []nums= {12,3453,23,6,789};
System.out.println(even(nums));
    }
}
