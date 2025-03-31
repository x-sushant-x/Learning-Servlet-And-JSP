package com.sushant.learning;

import javax.servlet.*;
import java.io.IOException;

public class LoggingFilter implements Filter {
    public void init(FilterConfig filterConfig) {}
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Request Received");
        chain.doFilter(request, response);
    }
    
    public void destroy() {}
}
