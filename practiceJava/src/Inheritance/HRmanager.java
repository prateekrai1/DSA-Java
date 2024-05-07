package Inheritance;

import jdk.nio.mapmode.ExtendedMapMode;

import java.util.ArrayList;

public class HRmanager extends Employee {

    private ArrayList<Employee> employeeslist;
    @Override
    public void work(){

    }
    public Employee addEmployee(Employee e){
        return e;
    }
}

