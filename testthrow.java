public class testthrow{
    public static void validate(int age) {
        if(age >= 18){
            System.out.println("Eligible to vote!");
        } else {
            throw new NullPointerException ("Not eligible to vote!");
        }
    }
    public static void main(String args[]){
        try {
            validate(1);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Printing rest of code...");
    }
}