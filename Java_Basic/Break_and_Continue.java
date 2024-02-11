import java.util.Scanner;

public class Break_and_Continue {
    public static void main(String[] args) {
        System.out.println("Enter the choice {1) Break 2) Continue}:- ");
        Scanner sc= new Scanner(System.in);
        int ch=sc.nextInt();

        switch (ch){
            case 1:
                System.out.println("This is Stop at third");
                for(int i=1; i<=5; i++){
                    if(i==3){
                        break;
                    }
                    else{
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                System.out.println("This is ignore the third");
                for(int i=1; i<=5; i++){
                    if(i==3){
                        continue;
                    }
                    else{
                        System.out.println(i);
                    }
                }
                break;
            default:
                System.out.println("You give wrong input!!!");
        }
    }
}
