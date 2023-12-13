package Interfaces;

public class car implements Engine,media {

    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    @Override
    public void acc() {
        System.out.println("Car acc");
    }
}
