package Interfaces;

public class nested {
    public interface nestedinterface{
        boolean isodd(int num);
    }
}
class b implements nested.nestedinterface{

    @Override
    public boolean isodd(int num) {
        return (num&1)==1;
    }
}
