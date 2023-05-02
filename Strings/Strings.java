import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
    //  
    // String firstname="Abhinav";
    // String lastname ="Chaudhary";
    // String fullname=firstname+" "+lastname;
    // System.out.println(fullname.length());
    // for(int i=0;i<fullname.length();i++){
    //     System.out.println(fullname.charAt(i));
    // }
    Scanner sc =new Scanner(System.in);
    String name ="Abhinav";
    String name1=sc.next();
    if(name.compareTo(name1)==0){
        System.out.println("String are equal");
    }else{
        System.out.println("String are not equal");
    }
    }
}
