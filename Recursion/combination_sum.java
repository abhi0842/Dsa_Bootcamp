import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList();
        subset(0,candidates,new ArrayList(),res,target);
        return res;
    }
 static void subset(int start, int[] nums, List<Integer> curr, List<List<Integer>> res, int target){
        if(target==0){
            res.add( new ArrayList(curr));
        }
        if(target<0){
            return ;
        }
        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            subset(i,nums,curr,res,target-nums[i]);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        int[]candidates = {2, 3, 6, 7}; int target = 7;
        combinationSum(candidates,target);
    }
}
