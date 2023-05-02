public class stringsearch {
//     public static int  search(String str,char target){
// if(str.length()==0){
//     return -1;
// }
// for(int i=0;i<str.length();i++){
//     if(target==str.charAt(i)){
//         return i;
//     }
// }
// return -1;
//     }
public static boolean search(String str,char target){
    if(str.length()==0){
        return false;
    }
    for(char ch:str.toCharArray()){
        if(ch==target){
            return true;
        }
    }
    return false;
}
    public static void main(String[] args) {
        String str ="abhinav";
        char target ='i';
        System.out.println(search(str,target));
    }
}
