package Abstractclasses;
//we are not allow to inetailize the object of abstract class because it does not make any sense because methords does not ahve any body.
//static methord are belong to the class rather then the object of the class
//we can not make any methord static in abstract classs because we are not allow to override the static methord in the abstract class.
//we are not allow to make any function or  methord of type final in the abstract class but we make the final variable and use in the different class as the constructor.
// Also it does not allow the multiple inheritance in the java either it abstract or not.
//We must have to learn about the interfaces in the jave for multiple inheritance.
//Interface generally contain the abstact functions.
//Abstract function are those funtions which does not require implementation for there declerations
//varaibles should be static in the interface
// parent parent= what things u access depend on this.
//new parent() which one version u access depend on this or simply overriding things.


public abstract class parent {


final int value;

    abstract void career(String name);
    abstract void brother(String name,int age);
 static int age;
public parent(int age){
    this.age=age;
    value=32443;
}
       void methord(){
    System.out.println("hey");
}




}
