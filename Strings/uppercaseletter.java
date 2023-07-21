public class uppercaseletter {
    public static char string(String str){
        if(str.length()<1){
            return '0';
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                return ch;
            }
        }
        return '0';
    }

    public static void main(String[] args) {
        String str="abhiNav";
        System.out.println(string(str));
    }
}
