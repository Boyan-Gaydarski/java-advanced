package AdvDefiningClassesEx2CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public double getAverageSalary() {
        return this.employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    public String getName() {
        return this.name;
    }
}
