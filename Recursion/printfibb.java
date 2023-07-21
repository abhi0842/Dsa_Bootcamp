import org.w3c.dom.ls.LSOutput;

public class printfibb {
    public static int fibb(int n){
         if(n<2){
            return n;
        }
        return fibb(n-1)+fibb(n-2);

    }

    public static void main(String[] args) {

for(int i=0;i<3;i++){
    System.out.println(fibb(i)+" ");
}
      //  System.out.println(n+" th fibonacci number is"+fibb(n));
    }
}
