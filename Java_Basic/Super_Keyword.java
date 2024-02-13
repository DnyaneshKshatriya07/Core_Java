class X {
    X(){
        super();//This is present default.
        System.out.println("in X");
    }
    X(int a){
        super();//This is present default.
        System.out.println("in X int");
    }
}

class Y extends X{
    Y(){
        super();//This is present default.
        System.out.println("in Y");
    }
    Y(int a){
        super(a);//This is present default.But we provide the parameter here then we will get the expected output.
        System.out.println("in Y int");
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        System.out.println("____________________________________");
        Y y1=new Y(9);
        //Here the expected output is in X int, in Y int
        //But output is in X, in Y int this is because there will be super method present default
    }
}
