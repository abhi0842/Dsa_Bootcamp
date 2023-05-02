 /*class circle {
   public double radius;
   circle(double r){
    System.out.println(" I am a perameterized radius");
    this.radius =r;
   }
   public   double area(){
    return Math.PI*radius*radius;
     }
   
}
 class cylinder1 extends circle{
    public double height;
   cylinder1(double r,double h){
    super (r);
    this.height=h;
}

public double volume(){
    return Math.PI*radius*radius*height;
}
}
public class classes {
    public static void main(String[] args) {
       circle obj =new circle(3);
       double a=obj.area(); 
       System.out.println(a);
    }
}*/
class rectangle{
    public int length;
    public int breadth;
    rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public int area(){
        return length*breadth;
    }
    
} 
class cuboid extends rectangle{
    public int heigth;
    cuboid(int l,int b,int h){
        super(l,b);
        this.heigth =h;
    }
    public int area1(){
        return length*breadth*heigth;
    }
}
public class classes{
    public static void main(String[] args) {
        rectangle obj =new rectangle(2, 2);
       System.out.println( obj.area());
       cuboid obj1 =new cuboid(2,3,4);
       System.out.println(obj1.area1());
    }
}
