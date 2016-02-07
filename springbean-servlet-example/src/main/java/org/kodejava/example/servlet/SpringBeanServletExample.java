package org.kodejava.example.servlet;

import org.kodejava.example.servlet.dao.UserDao;
import org.kodejava.example.servlet.model.User;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SpringBeanServletExample extends HttpServlet {
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {
        Long userId = Long.valueOf(req.getParameter("user_id"));

        ServletContext context = getServletContext();
        WebApplicationContext ctx =
                WebApplicationContextUtils
                        .getWebApplicationContext(context);
        UserDao dao = ctx.getBean("userDao", UserDao.class);

        User user = dao.getUser(userId);

        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.print("User Details: " + user.toString());
        pw.flush();
    }
}
