package Interfaces;

public class mediaplayer implements media{
    @Override
    public void start() {
        System.out.println("Rock the music");
    }

    @Override
    public void stop() {
        System.out.println("stop the music");
    }
}
