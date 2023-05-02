public class search_in_mountain {
    public static int find_peak(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }

        }
        return start;
    }
    
    public static int binary(int []arr,int target,int start,int end){
        boolean isacen=arr[start]<arr[end];
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isacen){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={1,2,4,5,6,3,2,1};
        int peak=find_peak(arr);
        int target=5;
        int target1=2;
      
    System.out.println( binary(arr, target, 0, peak));
    System.out.println(binary(arr, target1, peak, arr.length-1));
    }
}
