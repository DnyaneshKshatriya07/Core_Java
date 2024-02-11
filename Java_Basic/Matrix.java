import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows:- ");
        int row=sc.nextInt();
        System.out.println("Enter the no. of columns:- ");
        int col=sc.nextInt();
        int [][]a= new int[row][col];
        for (int i=0; i< row;i++)
        {
            System.out.println("Matrix A Row no.:- "+i);
            System.out.println();
            for (int j=0; j<col;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }

        int [][]b=new int[row][col];
        for (int i=0; i< row;i++)
        {
            System.out.println("Matrix B Row no.:- "+i);
            System.out.println();
            for (int j=0; j<col;j++)
            {
                b[i][j]= sc.nextInt();
            }
        }

        int [][]c=new int[row][col];
        System.out.println("Result is:- ");
        for (int i=0; i< c.length;i++)
        {
            for (int j=0; j<c.length;j++)
            {
                c[i][j]= a[i][j]+b[i][j];
            }
        }


//        System.out.println(a[2][0]);
        for (int i=0; i< c.length;i++)
        {
            System.out.println();
            for (int j=0; j<c.length;j++)
            {
                System.out.print(" "+c[i][j]);
            }
        }
        System.out.println();
        System.out.println("Transpose of Matrix is:- ");
        for (int j=0; j< c.length;j++)
        {
            for (int i=0; i<c.length;i++)
            {
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }
}