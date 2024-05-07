package oopsExcercises;

public class Employee {
    private String name;
    private String job_title;
    private double salary;

    public String getName(){
        return name;
    }
    public String getJob_title(){
        return job_title;
    }
    public double getSalary(){
        return salary;
    }

    public Employee (String name, String job_title, int salary){
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
    }

    public double updated_salary(double inc_percent){
        return salary = salary + salary * inc_percent/100;
    }

    public static void main(String [] Args){
        Employee emp1 = new Employee("Prateek","software developer",10000);
        //emp1.updated_salary(10);
        System.out.println(emp1.updated_salary(10));
        System.out.println(emp1.salary);

    }
}
