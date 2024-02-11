import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String s1= "abc";
        String s2= "ABC";
        String s3= new String("abc");

        System.out.println(s1.charAt(1));
        System.out.println(s1.equals(s3));
        System.out.println(s1.contains(s3));
        System.out.println(s1.concat(s2));
        System.out.println(s1.length());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replace('a','X'));

        String a="I love programing. programing is osm";
        String b= a.replace("programing","Java");

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.substring(19));
        System.out.println(a.substring(0,18));
    }
}