/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edu.hibernate.dto;

/**
 *
 * @author DELL
 */
public class Visiting extends Lecturer{
    
    private double hourlyCharges;

    public Visiting() {
    }

    public double getHourlyCharges() {
        return hourlyCharges;
    }

    public void setHourlyCharges(double hourlyCharges) {
        this.hourlyCharges = hourlyCharges;
    }
    
    
}
