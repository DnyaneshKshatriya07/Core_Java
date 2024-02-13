import java.util.Scanner;

public class Function {
    static int add(int a, int b){
//        int c=a+b;
        return a+b;
    }
    static String[] Heroes(){
        String[] superheroes= {"Ram","Hanuman","Lakshuman","Bhim"};
        return superheroes;
    }
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println(add(x,y));

        String[] arr= Heroes();
        for(String hero : arr){
            System.out.println(hero);
        }
    }
}
