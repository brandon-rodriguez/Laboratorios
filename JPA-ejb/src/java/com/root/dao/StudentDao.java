/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root.dao;

import com.root.model.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author brandonrodriguez
 */
@Stateless
public class StudentDao implements StudentDaoLocal {
    @PersistenceContext
    private EntityManager em;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void addStudent (Student student){
        em.persist(student);
    }
     @Override
    public void editStudent (Student student){
        em.merge(student);
    }
     @Override
    public void deleteStudent (int studentId){
        em.remove(getStudent(studentId));
    }
     @Override
    public Student getStudent (int studentId){
        return em.find(Student.class, studentId);
    }
     @Override
    public List<Student> getAllStudents (){
        return em.createNamedQuery("Student.getAll").getResultList();
    }
    
}
