public class substringrecurssion {
    public static void skip(String Str,String ans){
        if(Str. isEmpty()){
            System.out.println(ans);
            return;
        }
       char ch=Str.charAt(0);
        if(ch=='a'||ch=='b'){
            skip(Str.substring(1),ans);
        }
        else{
            skip(Str.substring(1),ans+ch);
        }
    }
    public static void main(String[] args) {
      skip("baccdah","");

    }
}
