/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooproject;

/**
 *
 * @author johnsmac
 */
public class CommisionEmployee extends Employee implements Displayable {

    private double GrossSales;
    private double CommisionRate;

    public CommisionEmployee() {
    }

    public CommisionEmployee(double GrossSales, double CommisionRate, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.GrossSales = GrossSales;
        this.CommisionRate = CommisionRate;
    }

    public double getGrossSales() {
        return GrossSales;
    }

    public void setGrossSales(double GrossSales) {
        this.GrossSales = GrossSales;
    }

    public double getCommisionRate() {
        return CommisionRate;
    }

    public void setCommisionRate(double CommisionRate) {
        this.CommisionRate = CommisionRate;
    }

    @Override
    public double earning() {

        return GrossSales * CommisionRate;

    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "GrossSales=" + GrossSales + ", NHours=" + CommisionRate + '}';
    }

    public void DisplayDetails() {
        System.out.println(super.toString());
        System.out.println(toString());

    }

    public void DisplayEarnings() {

        System.out.println("Earnings ="+ earning());

    }
}
