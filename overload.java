public class overload {

    // overloading = same method name but different parameters

    // overloaded methods
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return (a + b) * c;
    }

    public static void main(String args[]) {
        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 2));
    }
}
