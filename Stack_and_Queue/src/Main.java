import stack.customstack;
import stack.stackException;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws stackException {
        customstack stack=new customstack();
        stack.push(44);
        stack.push(54);
        stack.push(4434);
        stack.push(434);
        System.out.println(stack.peak());


    }
}