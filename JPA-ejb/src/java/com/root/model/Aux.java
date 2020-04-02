/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root.model;

/**
 *
 * @author brandonrodriguez
 */
public class Aux {
    private int studentCode;
    private int classCode;
    private String studentName;
    private String className;

    public Aux(int studentCode, int classCode, String studentName, String className) {
        this.studentCode = studentCode;
        this.classCode = classCode;
        this.studentName = studentName;
        this.className = className;
    }

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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    
    
}
