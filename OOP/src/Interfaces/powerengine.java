package Interfaces;

public class powerengine implements Engine {
    @Override
    public void start() {
        System.out.println("start the engine of the car");
    }

    @Override
    public void stop() {
        System.out.println("stop the engine of the car");
    }

    @Override
    public void acc() {
        System.out.println("acc");
    }
}
