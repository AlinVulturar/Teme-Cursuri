package curs11Teme.java;

import java.util.*;
public class Employee extends Person{
    String company;
    int salary;

    public static void main(String[] args) {
    public Employee(String name, String company, int salary) {
        super(name);
        this.company = company;
        this.salary = salary;
    }
}

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "Google", 100000));
        employees.add(new Employee("Bob", "Apple", 90000));
        employees.add(new Employee("Charlie", "Amazon", 110000));
        employees.add(new Employee("Dave", "Google", 95000));


        int minSalary = 100000;
        List<Person> highEarners = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.salary > minSalary) {
                highEarners.add(employee);
            }
        }


        Map<String, List<Person>> companyMap = new HashMap<>();
        for (Employee employee : employees) {
            List<Person> employeesForCompany = companyMap.getOrDefault(employee.company, new ArrayList<>());
            employeesForCompany.add(employee);
            companyMap.put(employee.company, employeesForCompany);
        }


        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salary;
        }


        Map<String, Integer> companySalaryMap = new HashMap<>();
        for (Employee employee : employees) {
            int companySalary = companySalaryMap.getOrDefault(employee.company, 0);
            companySalary += employee.salary;
            companySalaryMap.put(employee.company, companySalary);
        }
        String highestPayingCompany = Collections.max(companySalaryMap.entrySet(), Map.Entry.comparingByValue()).getKey();


        System.out.println("High earners: " + highEarners);
        System.out.println("Company map: " + companyMap);
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Highest paying company: " + highestPayingCompany);
}
