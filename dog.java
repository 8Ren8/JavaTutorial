class doggo {
    String name;
    int age;
    boolean willBite;

    public void insert(String str, int num1, boolean answer) {
        name = str;
        age = num1;
        willBite = answer;
    }

    public void print() {
        if (age < 3) {
            System.out.println("Dog's name: " + name);
            System.out.println("Dog's age: " + age);
            System.out.println(name + " is a young dog.");
            if (willBite == true) {
                System.out.println("Will dog bite: " + willBite + " (Bad Dog)\n");
            } else {
                System.out.println("Will dog bite: " + willBite + " (Good Dog)\n");
            }
        } else if (age < 10) {
            System.out.println("Dog's name: " + name);
            System.out.println("Dog's age: " + age);
            System.out.println(name + " is an adult dog.");
            if (willBite == true) {
                System.out.println("Will dog bite: " + willBite + " (Bad Dog)\n");
            } else {
                System.out.println("Will dog bite: " + willBite + " (Good Dog)\n");
            }
        } else {
            System.out.println("Dog's name: " + name);
            System.out.println("Dog's age: " + age);
            System.out.println(name + " is an old dog.");
            if (willBite == true) {
                System.out.println("Will dog bite: " + willBite + " (Bad Dog)\n");
            } else {
                System.out.println("Will dog bite: " + willBite + " (Good Dog)\n");
            }
        }
    }
}

public class dog {
    public static void main(String args[]) {
        doggo dog1 = new doggo();
        dog1.insert("Hermes", 2, true);
        dog1.print();

        doggo dog2 = new doggo();
        dog2.insert("Thor", 10, false);
        dog2.print();

        doggo dog3 = new doggo();
        dog3.insert("Heimdal", 5, true);
        dog3.print();
    }
}
