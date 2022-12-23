public class complexNumbers {
    int real;
    int imaginary;

    public complexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        System.out.print(this.real + " + " + this.imaginary + "i");
    }

    public static void compare(complexNumbers c1, complexNumbers c2) {
        if (c1.real > c2.real) {
            c1.print();
            System.out.print(" is larger than ");
            c2.print();
        } else if (c1.real == c2.real) {
            if (c1.imaginary > c2.imaginary) {
                c1.print();
                System.out.print(" is larger than ");
                c2.print();
            } else if (c1.imaginary == c2.imaginary) {
                c1.print();
                System.out.print(" is equal to ");
                c2.print();
            } else {
                c1.print();
                System.out.print(" is smaller than ");
                c2.print();
            }
        } else {
            c1.print();
            System.out.print(" is smaller than ");
            c2.print();
        }
    }

    public static complexNumbers add(complexNumbers c1, complexNumbers c2) {
        complexNumbers cSum = new complexNumbers(0, 0);

        cSum.real = c1.real + c2.real;
        cSum.imaginary = c1.imaginary + c2.imaginary;

        return cSum;
    }

    public static complexNumbers minus(complexNumbers c1, complexNumbers c2) {
        complexNumbers cMinus = new complexNumbers(0, 0);

        if (c1.real > c2.real) {
            cMinus.real = c1.real - c2.real;
            cMinus.imaginary = c1.imaginary - c2.imaginary;
            return cMinus;
        } else if (c1.real == c2.real) {
            if (c1.imaginary > c2.imaginary) {
                cMinus.real = c1.real - c2.real;
                cMinus.imaginary = c1.imaginary - c2.imaginary;
                return cMinus;
            } else if (c1.imaginary == c2.imaginary) {
                cMinus.real = c1.real - c2.real;
                cMinus.imaginary = c1.imaginary - c2.imaginary;
                return cMinus;
            } else {
                cMinus.real = c2.real - c1.real;
                cMinus.imaginary = c2.imaginary - c1.imaginary;
                return cMinus;
            }
        } else {
            cMinus.real = c2.real - c1.real;
            cMinus.imaginary = c2.imaginary - c1.imaginary;
            return cMinus;
        }

    }

    public static void main(String args[]) {
        complexNumbers cN1 = new complexNumbers(5, 3);
        System.out.print("Complex Number 1: ");
        cN1.print();
        System.out.println("");

        complexNumbers cN2 = new complexNumbers(5, 3);
        System.out.print("Complex Number 2: ");
        cN2.print();
        System.out.println("\n");

        compare(cN1, cN2);
        System.out.println("\n");

        System.out.print("Sum of Complex Number 1 and Complex Number 2 is: ");
        complexNumbers cSum = add(cN1, cN2);
        cSum.print();
        System.out.println("\n");

        System.out.print("Difference between Complex Number 1 and Complex Number 2 is: ");
        complexNumbers cMinus = minus(cN1, cN2);
        cMinus.print();
        System.out.println("\n");
    }

}
