/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ooproject;

/**
 *
 * @author johnsmac
 */
public class OOProject {

    public static void main(String[] args) {
        
        
        Department d1= new Department(1,"IT Department");
        
        SalariedEmployee se= new SalariedEmployee(5000,800,200,"John","San Stifano",7690,Gender.male);
        d1.addEmployee(se);
        
        HourlyEmployee he= new HourlyEmployee(5000,64,"Jack","ABC",7640,Gender.male);
        d1.addEmployee(se);
        
        CommisionEmployee ce= new CommisionEmployee(5000,64,"Anna","ABCD",7680,Gender.female);
        d1.addEmployee(ce);
        
         System.out.println(d1.getEmployeecount());
         d1.printbasicdata();
         d1.printalldata();
        
        
        
        
        
        
        
        
        
        
    }
}
