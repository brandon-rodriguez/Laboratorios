/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root.dao;

import com.root.model.Relations;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author brandonrodriguez
 */
@Local
public interface RelationsDaoLocal {
    void addRelations(Relations relation);
    void deleteRelations(Relations relation);
    List<Relations> searchRelations(int code,String type);
    List<Relations> getAllRelations();
}
