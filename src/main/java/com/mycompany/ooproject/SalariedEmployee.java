/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooproject;

/**
 *
 * @author johnsmac
 */
public class SalariedEmployee extends Employee implements Displayable {

    private double salary;
    private double bonus;
    private double deduction;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double salary, double bonus, double deduction, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    @Override
    public double earning() {

        return salary + bonus - deduction;

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + ", bonus=" + bonus + ", deduction=" + deduction + '}';
    }

    public void DisplayDetails() {
        System.out.println(super.toString());
        System.out.println(toString());

    }

    public void DisplayEarnings() {
        
        System.out.println("Earnings ="+ earning());
        

    }

}
