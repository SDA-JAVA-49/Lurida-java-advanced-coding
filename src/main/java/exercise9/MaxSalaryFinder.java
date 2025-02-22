package exercise9;

import java.util.List;

public class MaxSalaryFinder {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Tom", 28000),
                new Employee(2, "Charlie", 25000),
                new Employee(3, "Jane", 32000)
        );


        double maxSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0.0);

        System.out.println("Maximum Salary: " + maxSalary);
    }
}
