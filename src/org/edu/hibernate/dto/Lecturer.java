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
public class Lecturer {
    
    private int id;
    private String name;

    public Lecturer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lecturer{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
