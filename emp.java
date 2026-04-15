import java.util.*;

//custom exception
class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}


class Employee implements Comparable<Employee> {
    int empId;
    String name;
    double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    //checking employee detail
    public static Employee checkDetail(List<Employee> list, String searchName)
            throws EmployeeNotFoundException {

        for (Employee emp : list) {
            if (emp.name.equalsIgnoreCase(searchName)) {
                return emp;
            }
        }

        //throwing custom exceptions
        throw new EmployeeNotFoundException("Employee with name '" + searchName + "' not found.");
    }

    public int compareTo(Employee that) {
        return Double.compare(that.salary, this.salary);
    }

  
    public String toString() {
        return empId + " , " + name + " , " + salary;
    }
}


public class emp {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();


        employees.add(new Employee(1, "Rajat", 50000));
        employees.add(new Employee(2, "Aman", 70000));
        employees.add(new Employee(3, "Rohan", 60000));
        employees.add(new Employee(4, "Varun", 80000));
        employees.add(new Employee(5, "Karan", 55000));

        Collections.sort(employees);

        System.out.println("Employees sorted by salary (Descending):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("  Enter employee name to search: ");
        String name = sc.nextLine();

        try {
            Employee found = Employee.checkDetail(employees, name);
            System.out.println("Employee Found: " + found);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
