

class phone{
    public void call(){
        System.out.println("call the number");
    }}
class smartphoone extends phone{
    public void camera(){
        System.out.println("switch the camera");
    }}
public class inheritan{
    public static void main(String[] args) {
        //phone obj =new phone();
        //obj.call();
   phone obj  =new smartphoone();
        obj.call  ();    }
}
