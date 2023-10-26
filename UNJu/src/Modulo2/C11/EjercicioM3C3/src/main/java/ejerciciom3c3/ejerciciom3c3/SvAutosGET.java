package ejerciciom3c3.ejerciciom3c3;

import jakarta.servlet.ServletException;
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
public class SvAutosGET extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ArrayList<Auto> listaAutos = (ArrayList<Auto>) session.getAttribute("listaAutos");
        request.setAttribute("listaAutos", listaAutos);
        request.getRequestDispatcher("mostrarAutos.jsp").forward(request, response);

    }
}
