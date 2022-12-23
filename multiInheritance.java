//Interface can only contain abstract method, so no need to use abstract keyword for method in interface
interface Printable {
    public void print();
}

// All variables in interface are static and final.
interface Showable {
    public void show();

    int num = 100;
}

// abstract class can contain both normal method and abstract method
abstract class Displayable {
    // abstract method
    public abstract void display();

    // normal method
    public void normalDisplay() {
        System.out.println("Displaying from normal method in abstract class.");
    }
}

public class multiInheritance extends Displayable implements Printable, Showable {

    public void display() {
        System.out.println("Displaying from abstract method in abstract class.");
    }

    public void print() {
        System.out.println("Printing from printable interface.");
    }

    public void show() {
        System.out.println("Showing from showable interface.");
    }

    public void ownPrint() {
        System.out.println("Printing from own method in own class.");
    }

    public static void main(String args[]) {
        multiInheritance multiInh = new multiInheritance();

        multiInh.display();

        // direct call normal method in abstract class casue normal method already have
        // body.
        multiInh.normalDisplay();

        multiInh.print();
        multiInh.show();
        multiInh.ownPrint();

        // Can directly print variable without creating an object cause variable in
        // interface is static
        System.out.println(num);

        // num = 20; (cannot change value of num because variable in interface is final)
    }

}
