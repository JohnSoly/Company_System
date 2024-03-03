/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooproject;

/**
 *
 * @author johnsmac
 */
public class BasePlusComissionEmployee extends CommisionEmployee {

    private double base;

    public BasePlusComissionEmployee() {
    }

    public BasePlusComissionEmployee(double base, double GrossSales, double CommisionRate, String name, String address, int ssn, Gender sex) {
        super(GrossSales, CommisionRate, name, address, ssn, sex);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override 
    public double earning() {

        return super.earning()+base;

    }

    @Override
    public String toString() {
        return "BasePlusComissionEmployee{" + "base=" + base + '}';
    }
    
    @Override
    public void DisplayDetails() {
        System.out.println(super.toString());
        System.out.println(toString());

    }
    @Override
    public void DisplayEarnings() {

        System.out.println("Earnings ="+ earning());

    }

}
