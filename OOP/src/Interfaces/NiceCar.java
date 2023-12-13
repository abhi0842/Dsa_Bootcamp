package Interfaces;

public class NiceCar {
    private Engine engine;
    private media media=new mediaplayer() ;
    public NiceCar(){
        engine=new powerengine();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void startengine(){
        engine.start();
    }
    public void startmusic(){
        media.start();
    }
}
