class employee {
    int salary = 5000;
}

public class inherintanceDeveloper extends employee {
    int bonus = 1000;

    public static void main(String args[]) {
        inherintanceDeveloper dev = new inherintanceDeveloper();
        System.out.println("Salary of developer: " + dev.salary);
        System.out.println("Bonus of developer: " + dev.bonus);
    }
}
