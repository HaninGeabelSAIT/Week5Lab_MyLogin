
 
package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;

/**
 *
 * @author Hanin
 */
public class LoginServlet extends HttpServlet {

    

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     

    HttpSession session = request.getSession();
     String name = (String) session.getAttribute("name");
 

    String logout = request.getParameter("logout");
    if (logout != null){
        request.setAttribute("msg", "You have successfully logged out.");
        session.invalidate();
        
       
       session = request.getSession();
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }
        else if (name != null) {
            response.sendRedirect("Home.jsp");
        } 
        else{
         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);    

    }

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
         
          
          
          
        String  name = request.getParameter("name");
String  password = request.getParameter("password");
AccountService userAccount = new AccountService(name, password);
if (name== null || name.equals(null) || password == null || password.equals(null)){
    request.setAttribute("msg","You must enter the required information. ");
     getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                    .forward(request,response);
}
else if (userAccount.login(name, password)!= null){
    request.setAttribute("msg","You successfully logged in. ");
    HttpSession session = request.getSession(); 
    session.setAttribute("name", name);
     getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                    .forward(request,response);
}
else {
    request.setAttribute("msg", "Failed authentication");
     getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                    .forward(request,response);
}
   


   
}
}