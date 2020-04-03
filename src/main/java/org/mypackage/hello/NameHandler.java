/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author brandonrodriguez
 */
public class NameHandler {
    String name;
    String year;
    String birthday;
    String semester;
    SimpleDateFormat formatter ;
    Date date;
    
    public NameHandler(){
    name=null;
    year=null;
    birthday=null;
    semester=null;
    formatter = new SimpleDateFormat("yyyy-MM-dd");  
    date = new Date();   
    }
    public String getDate() {        
        return formatter.format(date);    
    } 
    public String getName() {        
        return name;    
    }   
    
    public void setName(String name) {    
        this.name = name;  
    } 

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBirthday() {
        LocalDate d1 = LocalDate.parse(birthday, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.parse(formatter.format(date), DateTimeFormatter.ISO_LOCAL_DATE);
        Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
        int diffDays = (int)((double)diff.toDays()/365);
        return Integer.toString(diffDays);
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSemester() {
         LocalDate d1 = LocalDate.parse(year, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.parse(formatter.format(date), DateTimeFormatter.ISO_LOCAL_DATE);
        Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
        int diffDays = (int)((double)diff.toDays()/365)*2+1;
        if(semester.trim().equals("2")){
            diffDays--;
        }
        return Integer.toString(diffDays);
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    
}
