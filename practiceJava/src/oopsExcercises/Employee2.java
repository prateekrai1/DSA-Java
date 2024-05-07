package oopsExcercises;

import java.time.LocalDate;
import java.time.Period;

public class Employee2 {
    private String name;
    private int salary;
    private LocalDate hiredate;

    public Employee2(String name, int salary, LocalDate hiredate) {
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public int getYOS(LocalDate hiredate) {
        return Period.between(hiredate, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Employee2 emp = new Employee2("Prateek", 1000, LocalDate.parse("2020-02-28"));
        System.out.println(emp.getYOS(emp.hiredate));
        System.out.println(emp.hiredate);
        System.out.println(LocalDate.now());
    }
}
