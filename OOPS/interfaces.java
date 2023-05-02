interface nss{
    int age=19;
    void percentage10(int per);
    void percentege12(int per1);
}
class abhinav implements nss{

 public void percentage10(int per){
    System.out.println("the percentage of 10 class is 81");
}
public void percentage12(int per){
    System.out.println("the percentage of 12 class is 84");
}
}
 class interfaces {
    public static void main(String[] args) {
        abhinav a = new abhinav();
       a.percentage10(1);
       System.out.println(a.age);
    }
}
