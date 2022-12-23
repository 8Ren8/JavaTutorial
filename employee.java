//Employee class
class Employees {
    int id;
    double salary;

    // Default constructor
    public Employees() {
        id = 0;
        salary = 0.0;
    }

    // Parameterized constructor
    public Employees(int i, double s) {
        id = i;
        salary = s;
    }

    public void insert(int ID, double Salary) {
        id = ID;
        salary = Salary;
    }

    public void print() {
        String level = "";
        if (salary < 3000) {
            level = "low";
        } else if (salary > 3000 && salary < 5000) {
            level = "medium";
        } else {
            level = "high";
        }
        System.out.println("Salary for employee id " + id + " is " + level + " (" + salary + ")");
    }

    public static Employees add(Employees e1, Employees e2) {
        Employees eTotal = new Employees(0, 0);

        eTotal.id = e1.id + e2.id;
        eTotal.salary = e1.salary + e2.salary;

        return eTotal;
    }
}

// Main class
class Main {
    public static void main(String args[]) {
        Employees employee1 = new Employees();
        employee1.insert(1, 10000);
        employee1.print();

        Employees employee2 = new Employees();
        employee2.insert(2, 4000);
        employee2.print();

        Employees employee3 = new Employees();
        employee3.insert(3, 2800);
        employee3.print();

        Employees employee4 = new Employees();
        employee4.insert(4, 7000);
        employee4.print();

        Employees employee5 = new Employees();
        employee5.insert(5, 3500);
        employee5.print();

        // Create employee object with constructor
        Employees employee6 = new Employees(6, 5500);
        employee6.print();

        Employees employee7 = Employees.add(employee1, employee6);
        employee7.print();

        Employees employee9 = Employees.add(employee3, employee6);
        employee9.print();

        // Employee employee8 = new Employee(0, 0);
        // employee8.add(employee2, employee6);
        // employee8.print();

        // exception to catch error
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
