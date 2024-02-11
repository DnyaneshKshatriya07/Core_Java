public class Math_Function {
    public static void main(String[] args){

        int maxival=Math.max(5,4);
        int minval= Math.min(2,9);

        System.out.println(maxival);
        System.out.println(minval);

        System.out.println("----------------------------------------------------");
        double a=Math.floor(3.2);//Take BEFORE POINT
        double b=Math.ceil(3.2);//Take AFTER POINT
        double c=Math.round(3.2);//TAke ROUND_OFF
        double d=Math.round(3.8);//Take ROUND_OFF

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("----------------------------------------------------");

        double E=Math.E;
        System.out.println(E);

        System.out.println("----------------------------------------------------");

        double x= Math.log(E);
        double y=Math.log10(100);

        System.out.println(x);
        System.out.println(y);

        System.out.println("----------------------------------------------------");

        double k=Math.pow(5,2);
        System.out.println(k);

        System.out.println("----------------------------------------------------");
        double l=Math.sqrt(49);
        System.out.println(l);
        System.out.println("----------------------------------------------------");

        final double PI=Math.PI;
        System.out.println(PI);

        System.out.println(Math.sin(PI/2));
        System.out.println(Math.sin(0));

        System.out.println(Math.cos(PI/6));
        System.out.println(Math.cos(0));
    }
}
