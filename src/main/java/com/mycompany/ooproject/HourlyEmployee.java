/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooproject;

/**
 *
 * @author johnsmac
 */
public class HourlyEmployee extends Employee implements Displayable {
    
   private double Hourlyrate;
   private int NHours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(double Hourlyrate, double Commisionrate, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.Hourlyrate = Hourlyrate;
        this.NHours = NHours;
    }

    public double getHourlyrate() {
        return Hourlyrate;
    }

    public void setHourlyrate(double Hourlyrate) {
        this.Hourlyrate = Hourlyrate;
    }

    public double getNHours() {
        return NHours;
    }

    public void setNHours(double Commisionrate) {
        this.NHours =NHours;
    }
    
     @Override
    public double earning() {

        return Hourlyrate *NHours ;

    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "Hourlyrate=" + Hourlyrate + ", NHours=" + NHours + '}';
    }

    

    public void DisplayDetails() {
        System.out.println(super.toString());
        System.out.println(toString());

    }

    public void DisplayEarnings() {
        
        System.out.println("Earnings ="+ earning());
        

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
