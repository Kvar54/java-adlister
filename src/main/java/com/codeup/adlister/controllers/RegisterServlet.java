package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean invalid = Boolean.parseBoolean(request.getParameter("invalid"));
        request.setAttribute("invalid", invalid);
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String confirmPassword = request.getParameter("confirm_password");

            boolean invalidInputs =
                    username.isEmpty() ||
                            email.isEmpty() ||
                            password.isEmpty() ||
                            !password.equals(confirmPassword)
                    ;

            if(invalidInputs) {
                response.sendRedirect("/register?invalid=true");
                return;
            }

            User newUser = new User(username, email, password);

//        Users usersDao = DaoFactory.getUsersDao();
//        usersDao.insert(newUser);
            DaoFactory.getUsersDao().insert(newUser);
            response.sendRedirect("/login");

        }
}
