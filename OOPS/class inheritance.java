 
 class inheritance{
    public  int x;
     public int getx(){
         return x;
     }
     public void setx(int x){
         this.x = x;
     }
         public void printme(){
             System.out.println("i am a constructor");
         }
     
     class derived extends base{
     public int y ;
     public int gety(){
         return y;
     }
     public void sety(int y){
         this.y = y;
     }
 
     }
      public class second_class{
         public static void main(String[] args) {
             base b = new base();
             b.setx(12);
             System.out.println("the value of x is :");
             System.out.println(b.getX());
         }
     }
 
    
 class inheritance{
     public static void main(String[] args) {
         base b = new base();
         b.setx(12);
         System.out.println(b.getX());
     }

 }