public class statrtrn {

    /*
     * Usage of static keyword
     * The static keyword is a non-access modifier used for methods and attributes.
     * Static methods/attributes can be accessed without creating an object of a
     * class.
     * 
     * static method - can be accessed without creating an object of the class
     * first,
     * meaning no need initialize obejct with new keyword before using the method.
     * 
     * For non static method, need to create an object of that class first,
     * then only can access / call the non static method / variable.
     * 
     * If using static keyword, all objects under that class with share the same
     * static variables / static methods.
     * Eg. Changing of static variable value will change it for both objects.
     * 
     * If not using static keyword, all objects will have its own entity of the
     * variable / method.
     * Changing non static variable value in one object will only affect the non
     * static variable value in another object.
     */

    // With static
    /*
     * static int i = 5;
     * 
     * public static int add(int a, int b) {
     * return (a + b);
     * }
     */

    // Without static
    int i = 5;

    public int add(int a, int b) {
        return (a + b);
    }

    public static void main(String args[]) {

        // With static
        /*
         * System.out.println(add(7, 8));
         * System.out.println(i);
         */

        // Without static
        statrtrn noStatic = new statrtrn();

        System.out.println(noStatic.add(7, 8));
        System.out.println(noStatic.i);

    }

}
