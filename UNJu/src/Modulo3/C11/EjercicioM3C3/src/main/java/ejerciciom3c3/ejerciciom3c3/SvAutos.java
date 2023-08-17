package ejerciciom3c3.ejerciciom3c3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author KathePrc
 */
@WebServlet
public class SvAutos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String patente = request.getParameter("patente");
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String color = request.getParameter("color");
        String tipoMotor = request.getParameter("tipoMotor");

        Auto auto = new Auto(patente, marca, modelo, color, tipoMotor);
        
        HttpSession session = request.getSession();
        
        ArrayList<Auto> listaAutos = (ArrayList<Auto>) session.getAttribute("listaAutos");
        
        if (listaAutos == null) {
            listaAutos = new ArrayList<>();
        }
        
        listaAutos.add(auto);
        
        session.setAttribute("listaAutos", listaAutos);

        response.sendRedirect("autos.jsp");
        
    }

}
