package com.sushant.learning;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LifeCycleServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Servlet Initialized");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Servlet doGet Executed");
        response.getWriter().println("Hello, Servlet Life Cycle!");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet Destroyed");
    }

}
