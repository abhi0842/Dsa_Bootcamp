public class IntegertoRoman {
    public static void intToRoman(int num) {
        String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundred[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thou[]={"","M","MM","MMM"};
        System.out.println( thou[num/1000]+
                hundred[(num%1000)/100]+
                ten[(num%100)/10]+
                unit[num%10]);

    }

    public static void main(String[] args) {
        intToRoman(5);
    }
}
