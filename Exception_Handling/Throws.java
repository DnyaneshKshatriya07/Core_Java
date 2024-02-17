class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be Negative";
    }

//    @Override
    public String getMassage(){
        return "Radius cannot be Negative";
    }
}

public class Throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result= Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            double ar=area(6);
//            int c=divide(6,0);
//            System.out.println(c);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
        }


    }
}
