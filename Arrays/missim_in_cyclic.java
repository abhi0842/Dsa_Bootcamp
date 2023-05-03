public class missim_in_cyclic {
    static int missing(int []arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
          if(arr[i]<arr.length&&arr[i]!=arr[correct]){
              swap(arr,i,correct);
          }
          else{
              i++;
          }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
               return j;
            }
        }
        return arr.length;
    }
    static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,1,0};
        int c=missing(arr);
        System.out.println(c);
    }
}
