/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.root.controller;

import com.root.dao.ClassCDaoLocal;
import com.root.dao.RelationsDaoLocal;
import com.root.dao.StudentDaoLocal;
import com.root.model.Aux;
import com.root.model.Relations;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "RelationServlet", urlPatterns = {"/RelationServlet"})
public class RelationServlet extends HttpServlet {

    @EJB
    private ClassCDaoLocal classCDao;

    @EJB
    private StudentDaoLocal studentDao;

    @EJB
    private RelationsDaoLocal relationsDao;
    
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
       int studentCode=0;
       int classCode=0;
       String studenCodeP=request.getParameter("studentCode");
       String classCodeP=request.getParameter("classCode");
       String action= request.getParameter("actionR");
       
       
       if(studenCodeP!=null && !studenCodeP.equals("")){
       studentCode=Integer.parseInt(studenCodeP);
       }
       if(classCodeP!=null && !classCodeP.equals("")){
       classCode=Integer.parseInt(classCodeP);
       }
       
       Relations relation= new Relations(studentCode, classCode);
       if(action.equalsIgnoreCase("add")){
       relationsDao.addRelations(relation);
       
       }else if (action.equalsIgnoreCase("delete")){
       relationsDao.deleteRelations(relation);
       } else if(action.equalsIgnoreCase("search")){
           
           List<Relations> relationList= new ArrayList<>();
           
        if(studentCode!=0){
            relationList=relationsDao.searchRelations(studentCode, "student");
            
        }else if (classCode!=0){
             relationList=relationsDao.searchRelations(classCode, "class");
        }
        
        List<Aux> auxiliar= new  ArrayList<Aux>();
        
           for (int i = 0; i < relationList.size(); i++) {
               auxiliar.add(new Aux(
                       relationList.get(i).getStudentCode()
                       , relationList.get(i).getClassCode()
                       , studentDao.getStudent(relationList.get(i).getStudentCode()).getFirstname(),
                       classCDao.getClassC(relationList.get(i).getClassCode()).getName()));
           }
        
        request.setAttribute("allRelations",auxiliar);
        
       }else if(action.equalsIgnoreCase("searchAll")){
         List<Relations> relationList= relationsDao.getAllRelations();
         List<Aux> auxiliar= new  ArrayList<Aux>();
         
         for (int i = 0; i < relationList.size(); i++) {
               auxiliar.add(new Aux(
                       relationList.get(i).getStudentCode()
                       , relationList.get(i).getClassCode()
                       , studentDao.getStudent(relationList.get(i).getStudentCode()).getFirstname(),
                       classCDao.getClassC(relationList.get(i).getClassCode()).getName()));
           }
       
       request.setAttribute("allRelations",auxiliar);
       }
           
       //request.setAttribute("allRelations",relationsDao.getAllRelations());
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
