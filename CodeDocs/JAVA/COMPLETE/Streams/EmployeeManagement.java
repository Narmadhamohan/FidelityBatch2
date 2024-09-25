public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, "Sales", 60000));
        employees.add(new Employee("Bob", 40, "HR", 45000));
        employees.add(new Employee("Charlie", 35, "Sales", 70000));
        employees.add(new Employee("David", 28, "IT", 48000));

        // Part A: Using Streams and filters
        List<Employee> salesEmployees = employees.stream()
            .filter(emp -> "Sales".equals(emp.getDepartment()) && emp.getSalary() > 50000)
            .toList();

        System.out.println("Sales Employees with Salary > $50,000:");
        salesEmployees.forEach(System.out::println);
    }
}
