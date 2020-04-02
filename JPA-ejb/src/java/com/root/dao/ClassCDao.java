/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root.dao;

import com.root.model.ClassC;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author brandonrodriguez
 */
@Stateless
public class ClassCDao implements ClassCDaoLocal {
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addClassC(ClassC classC) {
        em.persist(classC);
    }
    
    @Override
    public void editClassC(ClassC classC) {
        em.merge(classC);
    }
     @Override
    public void removeClassC(int code) {
        em.remove(getClassC(code));
    }
     @Override
    public ClassC getClassC(int code) {
      return em.find(ClassC.class, code);
    }
    
     @Override
    public List<ClassC> getAllClassC() {
     return em.createNamedQuery("Class.getAll").getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
