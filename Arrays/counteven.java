public class counteven {
    public static int digit(int nums){
        if(nums<0){
            nums=nums*-1;
        }
        if(nums==0){
            return -1;
        }
        int count =0;
        while(nums>0){
            nums=nums/10;
            count++;
        }
        return count;

    }
    public static boolean even(int nums){
        int count =digit(nums);
        if(count%2==0){
            return true;
        }
        return false;
        }
        public static int cheakcount(int nums[]){
            int count =0;
            for(int num:nums){
                if(even(num)==true){
                    count++;
                }
            }
            return count;
        }
    public static void main(String[] args) {
      int num[]={12,4,5,66,777,8888};

       // System.out.println(digit(nums));
       System.out.println(cheakcount(num));
    }
}
