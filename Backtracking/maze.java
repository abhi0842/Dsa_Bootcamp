public class maze {
    public static int count (int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        int counta =right+left;
        return counta;
    }

    public static void main(String[] args) {
        System.out.println(count(3,3));
    }
}
