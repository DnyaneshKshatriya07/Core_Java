import java.util.Scanner;

public class StringPool {
    public static void main(String[] args) {
        String s1= "abc";
        String s2= "abc";
        String s3= new String("abc");

        if(s1==s2){ //ans of this is EQUAL
            System.out.println("Equal");
        }
//        if(s1==s3){ // but ans of this is NOT EQUAL Because of new keyword.
//            System.out.println("Equal");
//        }
//        if(s1.equals(s3)){ //ans of this is EQUAL Because different method is use.
//            System.out.println("Equal");
//        }

        else {
            System.out.println("Not equal");
        }


    }
}