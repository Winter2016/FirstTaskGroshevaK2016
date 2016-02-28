package com.nc.edu.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
/**
 * Created by Ксения on 2/27/2016.
 */
public class FirstTask extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse reresp) throws ServletException, IOException {
        Date currentDate = new Date();
        String browserName = req.getHeader("user-agent");
        PrintWriter pw = reresp.getWriter();
        pw.write("<b> Browser name is " + browserName + "</b>");
        pw.write("<br> <b> Current date is " + currentDate.toString() + "</b> </br>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
