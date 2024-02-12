/*
Find the average of variable length(random size) inputs.
*/
import java.util.Scanner;
import java.util.Stack;

public class Variable_Length_Arguments {
    static float getAvg(float ...Varchar){
        float sum=0;

        for(float num :Varchar){
            sum+=num;
        }
        return sum/Varchar.length;
    }
    public static void main(String[] args) {
        float arr1=getAvg(1,2,3,4,6,2,4,9);
        float arr2=getAvg(9,2,5);

        System.out.println(arr1);
        System.out.println(arr2);
    }
}