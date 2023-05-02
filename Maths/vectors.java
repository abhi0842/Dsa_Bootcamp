import java.util.*;
public class vectors {
    public static void main(String[] args) {
        // Vector v =new Vector();
        // v.add(1);
        // v.add(4);
        // v.add("abhi");
        // System.out.println(v);
        Vector v =new Vector(3,2);
      System.out.println("initial size: "+v.size());
      System.out.println("inital capacity : "+v.capacity());
      v.addElement(new Integer(1));
      v.addElement(new Integer(2));
      v.addElement(new Integer(3));
      v.addElement(new Integer(4));
      v.addElement(new Integer(11));
      v.addElement(new Integer(12));
      v.addElement(new Integer(13));
      v.addElement(new Integer(14));
      System.out.println(v.capacity());
      System.out.println((Integer)v.firstElement());
      System.out.println((Integer)v.lastElement());
    }
}
