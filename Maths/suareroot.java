public class suareroot {
    public static int sq(int x){
        int i=0;
        while(i*i==x){
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
    System.out.println(sq(4));

    }
}
