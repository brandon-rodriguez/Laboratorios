/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root.controller;

import com.root.dao.StudentDaoLocal;
import com.root.model.Student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author brandonrodriguez
 */
@WebServlet(name = "StudentServlet", urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {

      @EJB
    private StudentDaoLocal studentDao;

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id=0;
        int year=0;
        String action=request.getParameter("action");
        String studentIdString=request.getParameter("studentId");
         
        if(!studentIdString.equals("")&& studentIdString!=null){
        id= Integer.parseInt(studentIdString);
        }
        String firstname=request.getParameter("firstname");
        String lastname=request.getParameter("lastname");
        String yearLevel=request.getParameter("yearLevel");
        
        if(!yearLevel.equals("")&& yearLevel!=null){
        year= Integer.parseInt(yearLevel);
        }
        
            
    
        
        Student s= new Student( id,  firstname,  lastname,  year);
        
        if(action.equalsIgnoreCase("Add")){
            
           studentDao.addStudent(s);
        }else if(action.equalsIgnoreCase("Edit")){
            studentDao.editStudent(s);
        }else if(action.equalsIgnoreCase("Delete")){
            studentDao.deleteStudent(id);
        }else if(action.equalsIgnoreCase("Search")){
            s= studentDao.getStudent(id);
        }
           request.setAttribute("student", s);
           request.setAttribute("allStudents", studentDao.getAllStudents());
           request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
