public class EmployeeManagementWithFilter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, "Sales", 60000));
        employees.add(new Employee("Bob", 40, "HR", 45000));
        employees.add(new Employee("Charlie", 35, "Sales", 70000));
        employees.add(new Employee("David", 28, "IT", 48000));

        // Part B: Using Functional Interface
        EmployeeFilter filter = emp -> "Sales".equals(emp.getDepartment()) && emp.getSalary() > 50000;
        List<Employee> filteredEmployees = new ArrayList<>();

        for (Employee emp : employees) {
            if (filter.test(emp)) {
                filteredEmployees.add(emp);
            }
        }

        System.out.println("Filtered Employees using Functional Interface:");
        filteredEmployees.forEach(System.out::println);
    }
}
