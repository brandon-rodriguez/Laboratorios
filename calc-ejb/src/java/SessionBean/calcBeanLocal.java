/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author brandonrodriguez
 */
@Local
public interface calcBeanLocal {
public String recognize(String operation);
public int addition(int a, int b);
public int substraction(int a, int b);
public int multiply(int a, int b); 
public int divide(int a, int b);

}
