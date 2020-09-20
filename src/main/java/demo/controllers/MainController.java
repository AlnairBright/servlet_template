package demo.controllers;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.models.Sample;
import demo.utils.DatabaseManager;


@WebServlet("/")
public class MainController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        EntityManager em = DatabaseManager.getInstance().getEntityManager();

        Sample s = em.find(Sample.class, 1);

        if(s != null) {
            request.setAttribute("name", s.getName());
        } else {
            request.setAttribute("name", "Takaki Minami");            
        }

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/index.jsp");
        rd.forward(request, response);
    }
    
}