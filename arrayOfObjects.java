class Employee{
    int id;
    String e_name;

    //constructor
    public Employee(int id, String name){
        this.id = id;
        this.e_name = name;
    }

    public void display(){
        System.out.println("Employee ID: " + id + " || Employee Name: " + e_name + "\n");
    }
}
public class arrayOfObjects {
    public static void main(String args[]){

        //declare array of objects
        Employee empObj[] = new Employee[5];

        //another way of declaring the array of objects
        //Employee[] empObj = new Employee[5];

        //insert object into array of objects
        empObj[0] = new Employee(1, "Ali");

        empObj[1] = new Employee(2, "Tom");

        empObj[2] = new Employee(3, "Jerry");

        empObj[3] = new Employee(4, "Abu");

        empObj[4] = new Employee(5, "Abubu");

        //print objects inside array of objects
        for (int i = 0; i < empObj.length; i++){
            empObj[i].display();
        }
    }
}