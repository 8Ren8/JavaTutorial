public class constructor {

    int id;
    String name;
    int age;

    // constructor
    public constructor(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // default constructor - insert null values into variable
    public constructor() {

    }

    // overloaded constructor - same name but different parameters
    public constructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // overloaded constructor 2 with extra parameter
    public constructor(int age, int num) {
        this.age = age;
        System.out.println(num);
    }

    public void display() {
        System.out.println("Id: " + id + ", Name: " + name + ", Age: " + age);
    }

    public static void main(String args[]) {

        constructor s1 = new constructor(101, "Ali", 20);
        constructor s2 = new constructor(102, "Abu", 23);
        // calling default constructor
        constructor s3 = new constructor();
        constructor s4 = new constructor(104, "Uwu");
        constructor s5 = new constructor(22, 9487);

        s1.display();
        s2.display();
        // default constructor insert null values into variables
        s3.display();
        s4.display();
        s5.display();
    }
}
