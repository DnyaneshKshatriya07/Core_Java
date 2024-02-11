import java.math.BigInteger;

public class Big_Integer {
    public static void main(String[] args){

        BigInteger a=new BigInteger("1000000000000000000");
        BigInteger b=new BigInteger("500000000000000000");

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));

        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));

        System.out.println(a.pow(5));
        System.out.println(a.mod(b));

        System.out.println("----------------------------------------------------------");
        System.out.println("INTEGER TO BIG_INTEGER");
        int m=50;
        BigInteger B = new BigInteger(m +"");
        System.out.println(B);

        System.out.println(" BIG_INTEGER TO INTEGER");
        BigInteger A=new BigInteger("1234567890123456789");
        int y=A.intValue();///give random value because of range of int.
        System.out.println(y);

        long z=A.longValue();
        System.out.println(z);
    }
}
