class Person {
    int roll;
    String name;

    // Default Constructor
    Person() {
        System.out.println("Default Constructor");
        roll = 38;
        name = "Nayan";
    }

    // Parameterized Constructor
    Person(int x, String y) {
        System.out.println("Parameterize Constructor");
        roll = x;
        name = y;
    }

    // Copy Constructor
    Person(Person p2) {
        System.out.println("Copy Constructor");
        roll = p2.roll;
        name = p2.name;
    }

    public void print(){
        System.out.println(this.roll);
        System.out.println(this.name);
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        System.out.println("____________________________________");
        // Constructor is called at the time of creating the object
        // Call Default constructor
        Person p1 = new Person();
        //p1.print();
        System.out.println(p1.roll);
        System.out.println(p1.name);

        System.out.println("____________________________________");
        // Call Parameterize constructor
        Person p2 = new Person(10, "Mahesh");
        p2.print();
        System.out.println("____________________________________");

        // Call Copy constructor
        Person p3 = new Person(p2);
        p3.print();
    }
}
