public class skipstring {
    public static String skip(String p,String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("abhinav")){
            return skip(p,up.substring(7));
        }
        else{
            return up.charAt(0)+skip(p,up.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skip("","fdsfrffergrabhinavdggerg"));
    }
}
