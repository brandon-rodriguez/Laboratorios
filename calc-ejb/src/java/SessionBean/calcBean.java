/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author brandonrodriguez
 */
@Stateless
public class calcBean implements calcBeanLocal {
    public int addition(int a, int b){
    return a+b;
    }
    public int substraction(int a, int b){
    return a-b;
    }
    public int multiply(int a, int b){
    return a*b;
    }
    public int divide(int a, int b){
    return a/b;
    }
    
    public String recognize(String operation){
    String parts [] = operation.split(" ");
    String result=operation;
    if(parts[1].equals("+")){
     result+= " = "+addition(Integer.parseInt(parts[0]), Integer.parseInt(parts[2]));
    }else if (parts[1].equals("-")){
     result+= " = "+substraction(Integer.parseInt(parts[0]), Integer.parseInt(parts[2]));
    }else if (parts[1].equals("*")){
     result+= " = "+multiply(Integer.parseInt(parts[0]), Integer.parseInt(parts[2]));
    }else if (parts[1].equals("/")){
     result += " = "+divide(Integer.parseInt(parts[0]), Integer.parseInt(parts[2]));
    }
    return result;
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
