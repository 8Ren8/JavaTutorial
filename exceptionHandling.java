public class exceptionHandling{
    public static void main(String args[]){
        try{
            System.out.println("Printing from the try block.");

            //ArithmeticException - divide by zero
            double error = 1/0;
            System.out.println(error);

            //Anything below will be ignored if first exception is caught.
            System.out.println("Something between 1st and 2nd exception");
            //NullPointerException, referring to null
            String str = null;
            System.out.println(str.charAt(0));
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        finally {
            System.out.println("Finally block will always be executed. RIP");
        }

        System.out.println("Printing the rest of the code.");
    }
}