package Abstractclasses;

import Abstractclasses.parent;

public class son extends parent {
    public son(int age){
        super(age);
    }
        @Override
        void methord(){
        super.methord();
    }
    @Override
    void career(String name) {
        System.out.println("Iam going to be the " +name);
    }

    @Override
    void brother(String name, int age) {
        System.out.println("I love "+name+" He is "+age);

    }
}
