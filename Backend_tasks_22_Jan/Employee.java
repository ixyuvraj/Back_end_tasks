import java.util.*;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private static String company = "Innovatech";

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    private double calculateAnnualSalary() {
        return salary * 12;
    }

    private void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Company: " + company);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer i = 1;
        while(i==1){
            System.out.println("do you want to create new employee ? ");
            String ans = sc.nextLine();
            if(ans.equals("yes")){
                i=1;
            }
            else{
                i=0;
            }

            if(i==1){
                System.out.println("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.println("Enter Employee Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Employee Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine(); // consume newline
                

                Employee emp = new Employee(id, name, salary);
                emp.displayEmployeeDetails();
                System.out.println();
            }
        }
        sc.close();
    }
}
