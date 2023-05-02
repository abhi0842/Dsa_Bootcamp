

/*?
class rectangle{
    int breath;
    int length;
    public int area(){
        return length*breath;

    }
    public int peremeter(){
     return 2*(length+breath);
    }

}
public class second_class{
    public static void main(String[] args) {
        rectangle sq = new rectangle();

        sq.length = 4;
        sq.breath = 2;
        System.out.println(sq.area());
        System.out.println(sq.peremeter());

    }
}
class square{
    int side;
    public  int area(){
        return side*side;

    }
    public int peremeter(){
        return 4*side;

    }
}
    public class second_class{
        public static void main(String[] args) {
            square p = new square();
         p.side = 4;
         System.out.println(p.peremeter());
         System.out.println(p.area());

        }
    }
    class cellphone{
        public void vibrating(){
            System.out.println("vibrating");
        }
        public void ringing(){
            System.out.println("ringing");

        }
        public void calling(){
            System.out.println("call friend");
        }
    }
    public class second_class{
        public static void main(String[] args) {
            cellphone asus = new cellphone();
            asus.calling();
            asus.ringing();
            asus.vibrating();

        }
    }
    class circle{
        int radius;
        public float area(){
            return  (3.14*radius*radius);
        }
        public float circumfrance(){
            return (2*3.14*radius;
        }
    }
public class second_class{
    public static void main(String[] args) {
        circle n = new circle();
        n.radius = 2;
        System.out.println(n.area());
    }
}
class myemployee{
    private int id ;
    private String name;
    public void setname(String n ){
        name = n;
    }
public String getname(){
    return name;
}
public void setid(int i){
    id = i;
}
public int getid(){
    return id;
}
}
public class second_class{
    public static void main(String[] args) {
        myemployee abhinav = new myemployee();
        abhinav.setid(12);
        System.out.println(abhinav.getid());
        abhinav.setname("abhinav chaudhary");
        System.out.println(abhinav.getname());
    }
}
class myemployee{
    private int id ;
    private String name;
    public void setid(int i){
        id = i;
    }
    public int getid (){
        return id;
    }
    public void setname(String n ){
        name = n;

    }
    public String getname(){
        return name;
    }
    public myemployee(int myid ,String myname){
         id =myid;
        name = myname;
    }
}
public class second_class{
    public static void main(String[] args) {
        myemployee abhinav = new myemployee(12,"abhinav chaudhary");
     System.out.println(abhinav.getname());
     System.out.println(abhinav.getid());
    }
}
class employee{
   private int salary;
   public void setsalary(int i){
      salary = i;
   }
   public int getsalary(){
       return salary;
   }
   public employee(int mysalary){
       salary = mysalary;
   }
}
public class second_class{
public static void main(String[] args) {
    employee abhinav = new employee(10000
    );
    System.out.println(abhinav.getsalary());
}
}
class square {
    double radius;
    public double area(){
        return 3.14*radius*radius;
    }
    public double peremeter(){
        return 2*3.14*radius;
    }
}
public class second_class{
    public static void main(String[] args) {
        square sq = new square();
      sq.radius = 2;
      System.out.println(sq.area());
      System.out.println(sq.peremeter());
    }
}
class circle{
  private  double radius;
  public void setradius(double i){
      radius = i;
  }
  public double getarea(){
      return 3.14*radius*radius;
  }
  public circle(double newradius){
      radius = newradius;
  }
}
public class second_class{
    public static void main(String[] args) {
        circle c1 = new circle(2);
        System.out.println(c1.getarea());
    }
}
class cylinder{
    private double height;
    private double radius;

    public  void setheight(double h){
      this. height = i;
    }
    public void setradius(double r ){
      this.  radius = r;

    }
    public double getarea(){
        return 2*3.14*radius*height;

    }
    public double getvolume(){
        return 3.14*radius*radius*height;
    }
    public cylinder(double newradius , double newheight){
        height = newheight;
        radius = newradius;

    }
}
public class second_class{
    public static void main(String[] args) {
        cylinder c1 = new cylinder(1 ,  2);
        cylinder c2 = new cylinder(2, 1);
     System.out.println(c1.getarea());
     System.out.println(c1.getvolume());
     System.out.println(c2.getarea());
     System.out.println(c2.getvolume());
    }
}
class cylinder{
    private int radius;
    private int height;
    public void setheight(int h){
     height = h;
    }
    public void setradius(int r){
        radius = r;
    }

    public int getheight(){
        return height;
    }
    public int getradius(){
        return radius;
    }
}
public class second_class{
    public static void main(String[] args) {
       cylinder c1 = new cylinder();
       c1.setheight(12);
       c1.setradius( 13);
       System.out.println("the height of cylinder is:");
       System.out.println(c1.getheight());
       System.out.println("the  radius of cylinder is:" );
       System.out.println(c1.getradius());
    }
}
class cylinder {
    double  height;
    double radius;
    public void setheight(double h){
        height = h;
    }
    public void setradius(double  r){
        radius = r;
    }
public double getarea(){
    return 2*Math.PI*radius*height;
}
public double getvolume(){
    return Math.PI*radius*radius*height;
}
}
public class second_class{
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.setheight(11);
        c1.setradius(9);
       double c= c1.getarea();
       System.out.println(c);
       System.out.println(c1.getvolume());
    }
}
class rectangle{
    private int lenght;
    private int breadth;
    public rectangle(int lenght,int breadth){
        this.lenght= length;
    this.breadth = breadth;
    }
public int getlenght(){
    return lenght;
}
public int getbreadth(){
    return breadth;
}
}
public class second_class{
    public static void main(String[] args) {
        rectangle r1 = new rectangle(2, 3);
       System.out.println(r1.getbreadth()); 
    }
}
import java.util.Scanner;
public class second_class{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i<=1;i--){
            for(int j = n ; j<=i;j--){
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}
public class second_class{
    public static void main(String[] args) {
        System.out.println("hello world");

    }
} 
import java.util.*;
public class second_class{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        int c =a+b;
        System.out.println(c);
    }
}
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String a = sc.next();
      System.out.println(a);
	}
}
public class second_class{
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
import java.util.Scanner;
 class second_class{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
for(int i = a;i>1;i--){
    for(int j= i;j>0;j--){
        System.out.print(j);
    }

    System.out.println( );
}

    }
}
import java.util.Scanner;
public class second_class{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter the value of : a");
        int a = sc.nextInt();
        System.out.println("enter the value of : b");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(" a is greater than b");
        }
       else if(b>a){
            System.out.println("b is greater than a");
        }
        else if(b==a){
            System.out.println("a is equal to b");
        }
    }
        
    }
    class second_class {
        // A method that takes variable
        // number of integer arguments.
        static void fun(int... a)
        {
            System.out.println("Number of arguments: "
                               + a.length);
     
            // using for each loop to display contents of a
            for (int i : a)
                System.out.print(i + " ");
            System.out.println();
        }
     
        // Driver code
        public static void main(String args[])
        {
            // Calling the varargs method with
            // different number of parameters
           
            // one parameter
            fun(100);
               
              // four parameters
            fun(1, 2, 3, 4);
             
              // no parameter
              fun();
        }
    }
    class second_class{
        static void fun(String... a){
          //  System.out.println("the number  of string :" a.lenght);
            for(String x : a)
            System.out.println(x + " ");
        }
        public static void main(String args[]){
            fun("car");
            fun("papa","mummmy");
            fun("bus ","car","cat");
        }
    }
    class second_class{
        public static void main(String args[]){
            int x,a,b,c;
            a = 2;
            b= 4;
            c= 5;
           x = a-- + b++ - ++c;
           System.out.println(x);
        }
    }
    class second_class{
         public static <T> void generic(T x , T y){
            T t;
            t = x;
            x = y;
            y = t;
           
        }
            public static void main(String[] args) {
               // second_class obj = new second_class(); 
               Double x = new Double(88.0);
               Double y = new Double(99.1);
                System.out.println(" x ="+ x+" "+ "y = "+ y);
                generic(x,y) ;
                System.out.println(" x ="+ y+" "+ "y = "+ x );
        }
    }
    class second_class{
        static <E> void generic(E [] inputArray){
       for (E   element : inputArray){
        System.out.print(element);
       }
       System.out.println();
        }
    
    public static void main(String[] args) {
        Integer[] intArray = {1,23,3,34,43,4};
        Double[] doublearray = {1.1,1.2,12.2};
        Character[] charArray = {'s','f','e',};
        generic(intArray);
        generic(doublearray);
        generic(charArray);
    }
}
class second_class<T1,T2>{
    public void display(T1 var1,T2 var2){
        System.out.println("name:"+var1+", id:" +var2);
    }
    public static void main(String[] args) {
        second_class<String,Integer> obj1 = new second_class<String,Integer>();
        
        second_class<Integer,Integer> obj2 = new second_class<Integer,Integer>();
        obj1.display("monica",101);
        obj2.display(122,101);
    }
}
class second_class{
    int a;
    second_class(int a[]){
        this.a = a;
    }
    void printInt(){
        for(int x : a)
            System.out.println(x);
       
           
        }

    
    public static void main(String[] args) {
        
    }
}
class second_class<T>{
    private T x;
    public second_class(T t){
        x= t;
    }
    public void printdata(){
        System.out.println(x);
    }


public static void main(String[] args) {
    second_class<String> a = new second_class<String>("java");
a.printdata();
second_class<Integer> b = new second_class<Integer>(122);
b.printdata();
second_class<Double> c = new second_class<Double>(122.32);
c.printdata(); 

}
}
class second_class<T>{
    t a[];
    second_class(T x){
        a = x;
    }
    T getData(int i){
        return a[i];
    }
    static <T> void printdata(T b){
        for(int i = 0;i<b.length;i++){
            System.out.println(b.getData(i)+" ");
            System.out.println( );

        }
    }
    public static void main(String[] args) {
       Integer x[]= {1,23,4,45,5,6};
        second_class<Integer> aInt = new second_class<Integer>(x );
        printdata(aInt);
    }

}
import java.util.Scanner;
class second_class{
    public static void main(String[] args) {
        char operator;
        Double num1, num2 ;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the operator(+,-,*,/)");
       operator= input.next().charAt(0);

        

    }
}
class second_class{
    static <E> void print(E [] inputarrey){
        for(E ele : inputarrey){
            System.out.printf("%s",ele);
        }
        System.out.println();
    }
    public static void main(String[] args) {
      Integer[] intarray = {1,2,34,45,5,65};
      print(intarray);
      Character[] chararrey = {'a','d','h','d'};
      print(chararrey);
    }


}
class second_class<T1,T2>{
public void display(T1 var1,T2 var2){
    System.out.println("name :"+var1+" "+"id :"+var2);
}
public static void main(String[] args) {
    second_class<String,Integer>obj1 =  new second_class<String,Integer>();
    obj1.display("abhinav", 12);
}
}
class second_class<T,U>{
    T obj1;
    U obj2;
    second_class(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;

    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

}
class second_class{
public static void main(String[] args) {
    Test<String,Integer> obj = new Test<String,Integer>("abhinav",12);
    obj.print();
}
}
import java.util.*;
class second_class{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>() ;
a.add(1);
a.add(3);
a.add(2);
a.add(4);
a.remove(2);
System.out.println(a);
    }
}
import java.util.Scanner;
class second_class{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n    = sc.nextInt();
       for(int i=1;i<=n;i++){
      for(int j =1;j<= n;j++){
        System.out.print("*" );
      }
      System.out.println();
       }
    }}
    class second_class{
        public static void main(String[] args) {
            int n = 4;
            int m = 5;
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||j==1||j==n||i==m){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } 
        }
        
    }
    class second_class{
        public static void main(String[] args) {
            int n = 4;
            int m= 5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

class second_class{
    public static void main(String[] args) {
        int n =5;
        int m = 4;
        for(int i=n;i>=1;i--){
            for(int j= 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class second_class{
    public static void main(String[] args) {
        int n = 4;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){

            
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
 class second_class{
    public static void main(String[] args) {
        int n  = 5;
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"  ");

            }
            System.out.println();
        }
    }
 }
 class second_class{
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
 }
 class second_class{
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum =i+j;
                if(sum % 2==0){
                    System.out.print("1");
                    
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
 }
 class second_class{
    public static void main(String[] args) {
        int sum =0;
        int [] list = {12,12,12,12,33,4};
        for(int element:list){
            sum = sum+element;
        }
        System.out.println(sum);
    }
 }
class second_class{
    public static void main(String[] args) {
        boolean Isinarray =false;
        int num = 45;
        int[] a = {12,34,45,56,6};
        for(int ele : a){
            if(num ==ele){
                Isinarray = true;
                break;
            }
        }
        if(Isinarray){
            System.out.println("the value is presentim the array");
        }
        else{
            System.out.println("the value is not present in the array");
        }
    }
}
import java.util.Scanner;
class second_class{
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int sum = 0;
        System.out.println("Enter the length of array");
        int l = sc.nextInt();
        String a[] = new String [l];
        System.out.println("Enter the value of array");
        for(int i =0;i<l;i++){
            a[i]= sc.next();
        }
        System.out.println("Display the value of array");
        for (int j =0;j<l;j++){
            System.out.println(a[j]+" ");
        }
        System.out.println("the sum array is ");
            for (int i:a ){
                sum =sum+i;
            }
            System.out.println(sum);
       
    }
} */
