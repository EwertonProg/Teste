package servlet;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import br.instituto.modelo.cadastro.Jovem;
import br.instituto.negocio.cadastro.DataNegocio;

/**
 * Servlet implementation class CadastraJovemControle
 */
@WebServlet("/CadastrarJovem")
public class CadastraJovemControle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CadastraJovemControle() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		Date dataNascimento = DataNegocio.formatarData(request.getParameter("dataNas"));
		String rg = request.getParameter("rg");
		List<Jovem> jovens = (ArrayList<Jovem>) request.getServletContext().getAttribute("listaJovens");
		Jovem jovem = new Jovem(nome, dataNascimento, rg);
		jovens.add(jovem);
		response.sendRedirect("listarJovens.jsp");
	}

}
