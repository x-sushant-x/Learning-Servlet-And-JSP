package com.sushant.learning;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("Application Started");
    }

    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("Application Stopped");
    }
}
