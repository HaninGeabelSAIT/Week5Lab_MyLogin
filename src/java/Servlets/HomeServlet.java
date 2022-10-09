
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hanin
 */
public class HomeServlet extends HttpServlet {

    


  
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            HttpSession session = request.getSession();
        
        String name = (String) session.getAttribute("name");

        if (name != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                    .forward(request,response);
        }
        else {
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                    .forward(request,response);
        }
       
    }

}
////    @Override
////    protected void doPost(HttpServletRequest request, HttpServletResponse response)
////            throws ServletException, IOException {
////        getServletContext().getRequestDispatcher("/WEB-INF/Home.jsp")
////                    .forward(request,response);
////    }
//
// 
//
//}
