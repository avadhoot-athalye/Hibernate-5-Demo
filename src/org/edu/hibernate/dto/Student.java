/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edu.hibernate.dto;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Student implements Serializable{
    private int id;
    private String firstName;
    private String lastName;
    private Address correspondence;
    private Address permanent;
    private StudentAcademic academic;

    public Address getCorrespondence() {
        return correspondence;
    }

    public void setCorrespondence(Address correspondence) {
        this.correspondence = correspondence;
    }

    public Address getPermanent() {
        return permanent;
    }

    public void setPermanent(Address permanent) {
        this.permanent = permanent;
    }

    
   

    public StudentAcademic getAcademic() {
        return academic;
    }

    public void setAcademic(StudentAcademic academic) {
        this.academic = academic;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}