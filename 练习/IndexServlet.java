package com.ang.servlt;

import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if(user==null){
            resp.getWriter().write("<h1><a href='/login.html'>请登陆</a></h1>");
        }else {
            resp.getWriter().write("欢迎你" + user.getUsername());
            resp.getWriter().write("<h1><a href='/out'>不要留我</a></h1>");

            Cookie jsessionid = new Cookie("JSESSIONID",session.getId());
            resp.addCookie(jsessionid);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
