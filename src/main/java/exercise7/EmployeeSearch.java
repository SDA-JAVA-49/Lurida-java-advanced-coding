package exercise7;

import java.util.List;

public class EmployeeSearch {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Charlie", 25000),
                new Employee(2, "Jane", 32000),
                new Employee(3, "Tom", 28000)
        );

        Employee result = employees.stream()
                .filter(emp -> emp != null && emp.getSalary() >= 30000)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No employee found with salary >= 30000"));

        System.out.println("Found Employee: " + result);
    }
}
