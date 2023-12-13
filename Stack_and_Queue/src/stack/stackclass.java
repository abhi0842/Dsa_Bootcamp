package stack;

import java.util.Stack;
//stack data structure is used to store the data in a LIFO or FILO manner which means the element that comes first is out in the last and vice versa.
//stack data structure has to functions push and pop
//stack is class and queue is interface
public class stackclass {
    public static void main(String[] args) {
        Stack<String> stack =new Stack<>();
        stack.push("abhinav");
        stack.push("Aryan");
        stack.push("manu");
        stack.push("abhay");

        for(int i=stack.size();i>0;i--){
            System.out.println(stack.pop());
        }

    }
}
