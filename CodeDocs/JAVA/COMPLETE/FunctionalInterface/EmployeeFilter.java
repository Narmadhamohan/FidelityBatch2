import java.util.ArrayList;
import java.util.List;

// Functional interface
@FunctionalInterface
interface EmployeeFilter {
    boolean test(Employee employee);
}
