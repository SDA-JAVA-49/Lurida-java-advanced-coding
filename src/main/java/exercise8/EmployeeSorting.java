package exercise8;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Tom", 28000),
                new Employee(2, "Charlie", 25000),
                new Employee(3, "Jane", 32000)
        );


        List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());


        sortedEmployees.forEach(System.out::println);
    }
}
