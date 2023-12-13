package Inheritance;

public class Box {
    double l;
    double w;
    public double h;
    public Box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;

    }
    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;

    }
    Box(double h,double w,double l){
        this.h=h;
        this.w=w;
        this.l=l;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
}
