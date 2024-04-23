package com.example;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
class Department {
    private Long deptId;
    private String name;

    public Department(String name) {
        this.name = name;
    }
}

@Data
class Employee {

    private Long empId;
    private String name;
    private List<Department> department;

    public Employee(String name, List<Department> department) {
        this.name = name;
        this.department = department;
    }
}

public class Snippet3 {

    public List<Department> getDepartments(String name) {


        List<Employee> employess = Arrays.asList(
                new Employee("scott", List.of(new Department("SALES"), new Department("LEGAL"))),
                new Employee("tom", List.of(new Department("INVOICE"), new Department("LEGAL"))),
                new Employee("liam", List.of(new Department("SPORTS"), new Department("LEGAL"))));

        // 1. provide psuedo code to get list of Departments for a given name
        // 2. provide code to get the Department with name SPORTS

    }

}