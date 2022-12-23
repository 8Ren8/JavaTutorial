public class switchExample {

    public static void main(String args[]) {
        // int choice = 1;
        String choice = "1";

        // if no break after each case, will continue to run for other cases until break
        // or default
        switch (choice) {
            case "1": {
                System.out.println("Choice number 1.");
                // break;
            }
            case "2": {
                System.out.println("Choice number 2.");
                break;
            }
            case "3": {
                System.out.println("Choice number 3.");
                break;
            }
            case "4": {
                System.out.println("Choice number 4.");
                break;
            }
            case "5": {
                System.out.println("Choice number 5.");
                break;
            }
            default: {
                System.out.println("Invalid choice!");
            }
        }
    }

}
