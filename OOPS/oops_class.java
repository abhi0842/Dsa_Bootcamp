class circle{
    public double radius;
 circle(double r){
    this.radius=r;
 }
 public  double area(){
    return Math.PI*radius*radius;
 }
}
class cylinder extends circle{
   public double height;
   cylinder(double r,double h){
      super(r);
      this.height=h;
     
   }
   public double area1(){
      return 2*Math.PI*height*radius;
   }
}
public class oops_class{
    public static void main(String[] args) {
     circle obj =new circle(2)  ;
     System.out.println(obj.area());
cylinder c=new cylinder(2, 2);
System.out.println(c.area1());
    }
}