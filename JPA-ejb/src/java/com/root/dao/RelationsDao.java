/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root.dao;

import com.root.model.Relations;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author brandonrodriguez
 */
@Stateless
public class RelationsDao implements RelationsDaoLocal {
@PersistenceContext
private EntityManager em;
String qStudent = "SELECT rel FROM Relations AS rel WHERE rel.studentCode = :res";
String qClass   = "SELECT rel FROM Relations  AS rel WHERE rel.classCode = :res";
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void addRelations(Relations relation) {
        em.persist(relation); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteRelations(Relations relation) {
        em.remove(relation); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Relations> searchRelations(int code, String type) {
        String query="";
        if(type.equals("student")){
        query=qStudent;
        }else{
            query=qClass;
        }
        TypedQuery<Relations> q = em.createQuery(query, Relations.class);
        q.setParameter("res", code);
        return q.getResultList();
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Relations> getAllRelations() {
        return em.createNamedQuery("Relations.getAll").getResultList(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
