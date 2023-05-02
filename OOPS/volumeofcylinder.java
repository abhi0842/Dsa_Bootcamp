 class cylinder{
    public double radius;
    public double height;
    cylinder( double height,double radius){
        this.radius=radius;
        this.height=height;
    }
    public double Area(){
        return 2*Math.PI*radius*height;
    }
}
 class cylinder2 extends cylinder{
   public double length;
cylinder2(double height,double radius ,double length){
    super(height, radius);
    this.length=length;
}
    public double area(){
        return 2*Math.PI*height*radius*length;
    }


}
class cylinder3 extends cylinder2{
    public double breadth;
    cylinder3(double heigth,double radius,double length,double breadth){
        super( heigth,radius, length);

        this.breadth=breadth;
    }
    public double area1(){
        return 2*height*radius*length*breadth;
    }
}
public class volumeofcylinder {
    public static void main(String[] args) {
        cylinder c1=new cylinder(2, 2);
        double ans=c1.Area();
        System.out.println("arrea of cylinderis: ");
        System.out.println(ans);
        cylinder2 c = new cylinder2(2, 2,2);
        double an=c.area();
        System.out.println("area of cylinder1 is : ");
        System.out.println(an);
        cylinder3 a=new cylinder3(1, 2, 3, 4);
        double s=a.area1();
        System.out.println(a.area());
        System.out.println(s);
    }
}
