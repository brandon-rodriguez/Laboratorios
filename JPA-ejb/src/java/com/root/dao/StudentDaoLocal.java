/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root.dao;

import com.root.model.Student;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author brandonrodriguez
 */
@Local
public interface StudentDaoLocal {
    public void addStudent (Student student);
    public void editStudent (Student student);
    public void deleteStudent (int studentID);
    public Student getStudent (int studentID);
    public List<Student> getAllStudents ();
    
}
