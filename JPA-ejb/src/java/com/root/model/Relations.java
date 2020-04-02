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
@NamedQueries({@NamedQuery(name="Relations.getAll",query="SELECT e FROM Relations e")})

public class Relations {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO )
    @Column
    private int studentCode;
    @Column
    private int classCode;

    public Relations(int studentCode, int classCode) {
        this.studentCode = studentCode;
        this.classCode = classCode;
    }
    
    public Relations(){}
    
    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public int getClassCode() {
        return classCode;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }
    
    
}
