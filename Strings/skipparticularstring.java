public class skipparticularstring {
    public static String skipabhinotabhinav(String p,String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("abhi")&& !up.startsWith("abhinav")){
            return skipabhinotabhinav(p,up.substring(4));
        }
        else{
            return up.charAt(0)+skipabhinotabhinav(p,up.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skipabhinotabhinav("","rabhirabhinavd"));
    }
}
