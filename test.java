class students {
    int rollno;
    String name;
    int age;

    public void insert(int num1, String str, int num2) {
        rollno = num1;
        name = str;
        age = num2;
    }

    public void display() {
        if (rollno > 20) {
            System.out.println("Student id: " + rollno + " (Late admission)");
            System.out.println("Student name: " + name);
            System.out.println("Student age: " + age);
        } else {
            System.out.println("Student id: " + rollno);
            System.out.println("Student name: " + name);
            System.out.println("Student age: " + age);
        }
    }
}

public class test {
    public static void main(String args[]) {
        System.out.println("Testing 1234");

        students stud1 = new students();
        stud1.insert(1, "Alibaba", 20);
        stud1.display();

        students stud2 = new students();
        stud2.insert(2, "Jerry", 21);
        stud2.display();

        students stud3 = new students();
        stud3.insert(21, "Tom", 19);
        stud3.display();

    }
}
