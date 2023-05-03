import java.util.Arrays;

public class findpeak {
    public static int find(int nums[]){
        int start =0;
        int end=nums.length-1;
        while(start<end){
            int mid =start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
       int  nums[]={2,3,4,5,6,1};
      int c=find(nums);
        System.out.println(c);
    }
}
