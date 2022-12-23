import java.util.Scanner;

//user input example
public class student {

    int admissionNo;
    String name;
    String course;

    public student(int admissionNo, String name, String course) {
        this.admissionNo = admissionNo;
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("");
        System.out.println("Admission Number: " + admissionNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String args[]) {

        // student[] students = new student[3];
        int[] adminNums = new int[3];
        String[] names = new String[3];
        String[] courses = new String[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 2; i++) {
            System.out.println("Enter admission number: ");
            adminNums[i] = sc.nextInt();

            // get the enter after nextInt
            sc.nextLine();

            System.out.println("Enter name: ");
            names[i] = sc.nextLine();

            System.out.println("Enter course: ");
            courses[i] = sc.nextLine();

            System.out.println("");
        }

        System.out.println("Registered students: ");
        student stud1 = new student(adminNums[0], names[0], courses[0]);
        stud1.display();

        student stud2 = new student(adminNums[1], names[1], courses[1]);
        stud2.display();

        student stud3 = new student(adminNums[2], names[2], courses[2]);
        stud3.display();

        sc.close();
    }
}
