package com.woc.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Interceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if(session.getAttribute("userLoginInfo") != null)
        {
            return true;
        }
        if (request.getRequestURI().contains("login")){
            return true;
        }
        if (request.getRequestURI().contains("allBook"))
        {
            return true;
        }
        if(request.getRequestURI().contains("queryBook")){
            return true;
        }

        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
