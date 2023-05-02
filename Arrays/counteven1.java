public class counteven1 {
   public static boolean even(int num){
    int a =(int)Math.log10(num)+1;
    if(a%2==0){
        return true;
    }
    return false;
   } 
   public static int cheak(int num[]){
    int count=0;
    for(int nums:num){
        if(even(nums)==true){
            count++;
        }
    }
    return count;
   }
   public static void main(String[] args) {
    int nums[]={12,34,555,6667,7};
    System.out.println(cheak(nums));
   }
}
