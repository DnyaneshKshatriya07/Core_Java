public class Throw_Finally {
    public static void main(String[] args) {
        int i=4;
        int j=4;
        int[] num1={2, 3, 4};
        int result=0;

        try{
            result=i/j;
            //If we have to throw the exception by yourself then we have to used throw.
            if(result==1){
                throw new ArithmeticException();
            }
            System.out.println(num1[4]);
        }

        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Something went wrong");
        }

        //The finally block is run if the exception occur or not. This is run in any situation.
        finally {
            System.out.println("Bye");
        }

        System.out.println(result);
    }
}
