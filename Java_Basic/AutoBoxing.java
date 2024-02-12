import java.util.Scanner;
import java.util.SortedMap;

public class AutoBoxing {
    public static void main(String[] args) {

        int a=10;
        float b=7.7F;
        long c=1029218L;

        Integer intobj=a;
        Float floatobj=b;
        Long longobj=c;

        System.out.println(intobj);
        System.out.println(floatobj);
        System.out.println(longobj);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(Integer.max(5,2));
    }
}