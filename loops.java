public class loops {
    public static void main(String args[]) {

        // for loop
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " (for)");
        }

        // while loop
        int w = 0;
        while (w < 11) {
            System.out.println(w + " (while)");
            w += 2;
        }

        // do while loop
        int dw = 15;
        do {
            System.out.println(dw + " (do while)");
        } while (dw < 15);

        // nested for loop
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // nested while loop
        int outerLoop = 0;
        while (outerLoop < 11) {
            int innerLoop = 0;
            while (innerLoop < outerLoop) {
                System.out.print("%");
                innerLoop++;
            }
            System.out.println("");
            outerLoop++;
        }

        // labeled for loop with break and continue
        outer: for (int i = 0; i < 5; i++) {
            System.out.println("");
            int wloop = 0;
            inner: while (wloop < 6) {
                System.out.print("$");
                wloop++;
                if (wloop == 3) {
                    System.out.print("@@");
                    continue;
                } else if (i == 4) {
                    System.out.println("...");
                    break outer;
                }
            }
            System.out.println("");
        }
    }
}
