/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooproject;

/**
 *
 * @author johnsmac
 */
import java.util.ArrayList;

public class Department {

    private ArrayList<Employee> emplist;
    private int DNO;
    private String dname;

    public Department() {
    }

    public Department( int DNO, String dname) {
        emplist = new ArrayList<Employee>();
        this.DNO = DNO;
        this.dname = dname;
    }

    public int getDNO() {
        return DNO;
    }

    public void setDNO(int DNO) {
        this.DNO = DNO;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void addEmployee(Employee e) {
        emplist.add(e);
    }

    public void deleteEmployee(int index) {
        emplist.remove(index);
    }

    public int getEmployeecount() {
        return emplist.size();
    }

    public void printbasicdata() {
        for (int i = 0; i < emplist.size(); i++) {
            System.out.println(emplist.get(i).getSsn() + " " + emplist.get(i).getName() + " " + emplist.get(i).getSex());
        }
    }

    public void printalldata() {
        for (int i = 0; i < emplist.size(); i++) {
            if (emplist.get(i) instanceof SalariedEmployee) {
                ((SalariedEmployee) emplist.get(i)).DisplayDetails();
            }
            if (emplist.get(i) instanceof HourlyEmployee) {
                ((HourlyEmployee) emplist.get(i)).DisplayDetails();
            }
            if (emplist.get(i) instanceof CommisionEmployee) {
                ((CommisionEmployee) emplist.get(i)).DisplayDetails();
            }
            if (emplist.get(i) instanceof BasePlusComissionEmployee) {
                ((BasePlusComissionEmployee) emplist.get(i)).DisplayDetails();
            }

        }
    }

}
