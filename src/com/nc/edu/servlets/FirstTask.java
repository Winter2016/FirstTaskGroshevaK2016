package com.nc.edu.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Ксения on 2/27/2016.
 */
public class FirstTask extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse reresp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        PrintWriter pw = reresp.getWriter();
        if (password.equals("1234"))
            pw.write("<b> Hello " + name + "</b>");
        else
            reresp.sendError(401,"Wrong password");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        PrintWriter pw = resp.getWriter();
        pw.write("<b> Hello " + name + "</b>");
    }
}
