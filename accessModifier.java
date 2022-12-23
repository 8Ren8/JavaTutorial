class anotherClass {

    private int num = 50;

    private void print() {
        System.out.println("Print something.");
    }

    public anotherClass() {
        // print();
    }

    // method to get private num
    public int getNum() {
        return num;
    }

    // method to access private func
    public void getPrint() {
        print();
    }
}

public class accessModifier {

    public static void main(String args[]) {
        anotherClass aC = new anotherClass();

        // compile time error because private variables/methods can only be accessed in
        // its own class
        System.out.println(aC.getNum());
        aC.getPrint();
    }

}
