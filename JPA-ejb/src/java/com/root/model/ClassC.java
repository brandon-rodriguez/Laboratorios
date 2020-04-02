/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author brandonrodriguez
 */
@Entity
@Table
@NamedQueries({@NamedQuery(name="Class.getAll",query="SELECT e FROM ClassC e")})
public class ClassC {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO )
    @Column
    private int code;
    @Column
    private String name;
    @Column
    private int credits;
    @Column
    private int semester;
    @Column
    private int maxStudents;

    public ClassC(int code, String name, int credits, int semester, int maxStudents) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.semester = semester;
        this.maxStudents = maxStudents;
    }
    
    public ClassC(){}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }
    
    
}
