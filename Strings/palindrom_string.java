public class palindrom_string {
    public static boolean ispalindrom(String str){
        for(int i=0;i<str.length();i++){
        int start=str.charAt(i);
        int end=str.charAt(str.length()-i-1);
        if(start!=end){
            return false;
        }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="abcdcbda";
        System.out.println(ispalindrom(str));
    }
}
