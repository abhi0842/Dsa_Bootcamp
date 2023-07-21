public class uppercaserecurssion {
    public static char string(String str,int i){
        if(str.length()<1){
            return '0';
        }
            char ch =str.charAt(i);
            if(Character.isUpperCase(ch)){
                return ch;
            }
             return string(str,i+1);


    }
    public static void main(String[] args) {
        String str="abhiNav";
        System.out.println(string(str,0));
    }
}

