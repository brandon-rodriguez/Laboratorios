/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root.controller;

import com.root.dao.ClassCDao;
import com.root.dao.ClassCDaoLocal;
import com.root.model.ClassC;
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
@WebServlet(name = "ClassServlet", urlPatterns = {"/ClassServlet"})
public class ClassServlet extends HttpServlet {

    @EJB
    private ClassCDaoLocal classCDao;
  
  
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int code=0;
            int semester=0;
            int credits=0;
            int maxStudents=0;
           String name="";
           String nameP= request.getParameter("name");
           String codeP= request.getParameter("code");
           String semesterP= request.getParameter("semester");
           String creditsP= request.getParameter("credits");
           String maxStudentP= request.getParameter("maxStudents");
           String action= request.getParameter("actionC");
           
           if(nameP!=null && !nameP.equals("")){
               name=nameP;
           }
           
           if(codeP!=null && !codeP.equals("")){
               code= Integer.parseInt(codeP);
           }
           
           if(semesterP!=null && !semesterP.equals("")){
               semester= Integer.parseInt(semesterP);
           }
           
           if(creditsP!=null && !creditsP.equals("")){
               credits= Integer.parseInt(creditsP);
           }
           
           if(maxStudentP!=null && !maxStudentP.equals("")){
               maxStudents= Integer.parseInt(maxStudentP);
           }
           ClassC classC= new ClassC( code,  name,  credits,  semester,  maxStudents);
           
           if(action.equalsIgnoreCase("Add")){
           classCDao.addClassC(classC);
           }else if(action.equalsIgnoreCase("Edit")){
           classCDao.editClassC(classC);
           }else if(action.equalsIgnoreCase("Delete")){
           classCDao.removeClassC(code);
           }else if(action.equalsIgnoreCase("Search")){
           request.setAttribute("class",classCDao.getClassC(code));
           }
           request.setAttribute("allClasses", classCDao.getAllClassC());
           request.getRequestDispatcher("index.jsp").forward(request, response);
           
        }
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
