public class stringlengthrecurssion {
    public static int length(String str){
        if(str.equals("")){
            return 0;

        }
        return 1+length(str.substring(1));

    }

    public static void main(String[] args) {
        String str ="bjdb";
        System.out.println(length(str));
    }
}
