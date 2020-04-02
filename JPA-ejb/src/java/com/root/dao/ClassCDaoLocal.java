/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root.dao;

import com.root.model.ClassC;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author brandonrodriguez
 */
@Local
public interface ClassCDaoLocal {

    void addClassC(ClassC classC);
    void editClassC(ClassC classC);
    void removeClassC(int code);
    ClassC getClassC(int code);
    List<ClassC> getAllClassC();
    
}
