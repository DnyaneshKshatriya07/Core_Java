public class Try_Catch {
    public static void main(String[] args) {
        int i=10;
        int j=0;
        int[] num=new int[5];
        String str= null;
        try{
            j=100/i;
            System.out.println(num[2]);
            System.out.println(num[5]);
            System.out.println(str.length());
        }
        //This Catch is used for handle the Arithmetic Exception only.
        catch (ArithmeticException e){
            System.out.println("Cannot Divide by Zero");
        }

        //This Catch is used for handle the Array Index Out Of Bounds Exception only.
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is not match");
        }

        //This Catch is used for handle the ALL/ANY Exception.
        catch (Exception e){
            System.out.println("Something went wrong "+ e);
        }
        System.out.println(j);

        System.out.println("Byeee");
    }
}
