//65130500008 Jinnawat Vilairat
package com.jinnawat.mid_exam_008.servlet;

import com.jinnawat.mid_exam_008.models.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.*;

@WebServlet(name = "RegisterServlet", value = "/008/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String username = req.getParameter("username");
        String email = req.getParameter("email");

        User userNew = new User(username, email);
        session.setAttribute("user", userNew);
        req.setAttribute("userDisplay", "Welcome " + userNew.getUsername() + " (" +
                userNew.getEmail() + ")");
        resp.sendRedirect("is_prime.jsp");
    }
}
 
