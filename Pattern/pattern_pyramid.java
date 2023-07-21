
//    /*-------------------------------------pyramid_pattern------------------------------------------*/
//      public class pattern_pyramid {
//    public static void main(String[] args) {
//        int n=5;
        //outer for loop for number of row
//        for(int i=1;i<=n;i++){
        //inner loop 1 is for number of space in the pattern
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//        inner loop 2 for number of star in the pattern
//            for(int k=1;k<=i;k++){
//                System.out.print(k+" " );
//            }
//            System.out.println();
//        }
//    }
//}
        /*-------------------------------------half_butterfly------------------------------------------*/
// class pattern_pyramid {
//    public static void main(String[] args) {
// int n=5;
        //outer for loop for number of row
//  for(int i=0;i<2*n;i++){
//      int col=i>n?2*n-i:i;
        //inner for loop for number of column
//      for(int j=0;j<col;j++){
//          System.out.print("*");
//      }
//      System.out.println();
//  }
//  }
//  }
        /*-------------------------------------maximum in sorted rotated array------------------------------------------*/
//  class pattern_pyramid {
//    public static int find_peak(int []arr){
//        int start=0;
//        int end=arr.length-1;
//        while(start<end){
//            int mid=start+(end-start)/2;
//            if(arr[mid]>arr[mid+1]){
//                end=mid;
//            }
//            else{
//                start=mid+1;
//            }
//
//        }
//        return start;
//    }
//
//    public static int binary(int []arr,int target,int start,int end){
//        boolean isacen=arr[start]<arr[end];
//        while(start<end){
//            int mid=start+(end-start)/2;
//            if(arr[mid]==target){
//                return mid;
//            }
//            if(isacen){
//                if(arr[mid]<target){
//                    start=mid+1;
//                }
//                else{
//                    end=mid-1;
//                }
//            }
//            else{
//                if(arr[mid]>target){
//                    start=mid+1;
//                }
//                else{
//                    end=mid-1;
//                }
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[]arr={1,2,4,5,6,3,2,1};
//        int peak=find_peak(arr);
//        int target=5;
//        int target1=2;
//
//        System.out.println( binary(arr, target, 0, peak));
//        System.out.println(binary(arr, target1, peak, arr.length-1));
//    }
//    }
/*-------------------------------------Recurssion using multiple function------------------------------------------*/
//class pattern_pyramid{
//     static void  print1(int n){
//        System.out.println(n);
//        print2(2);
//    }
//    static void print2(int n){
//        System.out.println(n);
//       print3(3);
//    }
//    static void print3(int n){
//        System.out.println(n);
//    }
//    public static void main(String[] args) {
//       print1(1);
//    }
//}
/*-------------------------------------Recurssion using multiple function------------------------------------------*/
//class  pattern_pyramid{
//    public static void print(int n){
//        if(n==5){
//            System.out.println(n);
//            return ;
//        }
//        System.out.println(n);
//        print(n+1);
//        System.out.println(n);
//        return;
//    }
//    public static void main(String[] args) {
//        print(1);
//    }
//}
/*-------------------------------------fabonnaci using recursion------------------------------------------*/
class pattern_pyramid{
    public static int   fab(int n){
       if(n<2){
           return n;
       }
       return fab(n-1)+fab(n-2);
    }
    public static void main(String[] args) {
       int n=3;
       int ans=fab(5);
        System.out.println(ans);
    }
}