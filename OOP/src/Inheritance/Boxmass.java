package Inheritance;

import Inheritance.Box;

public class Boxmass extends Box {
    double mass;
    Boxmass(){
        this.mass=-1;
    }
    public Boxmass(double h, double w, double l, double mass){
        super(h,w,l);
        this.mass=mass;
    }

}
