import java.util.Scanner;

class complexNumber{
    int Real;
    int imaganary;
    complexNumber(int r, int i){
        Real=r;
        imaganary=i;
    }

    void print(){
        System.out.println(Real + " + "+imaganary+ "i");
    }

    complexNumber add(complexNumber y){
        int sumReal= Real+ y.Real;
        int sumImag= imaganary + y.imaganary;
        complexNumber result= new complexNumber(sumReal, sumImag);
        return result;
    }
}
public class Complex_Number {
    public static void main(String[] args) {
        complexNumber x=new complexNumber(2,3);
        x.print();

        complexNumber y=new complexNumber(-5,6);
        y.print();

        complexNumber z=x.add(y);
        z.print();
    }
}