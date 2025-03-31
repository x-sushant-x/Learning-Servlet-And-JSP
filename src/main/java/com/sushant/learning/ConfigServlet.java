package com.sushant.learning;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ConfigServlet extends HttpServlet {
    private String appName;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        appName = config.getInitParameter("AppName");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Application Name: " + appName);
    }
}
