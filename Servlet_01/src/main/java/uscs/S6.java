package uscs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S6
 */
@WebServlet("/S6")
public class S6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public S6() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Titulo = "SERVLET_06 - Coletando dados de um FORM HTML - Método HTTP - GET";
		out.println(
				"<HTML>" +
						"<HEAD><TITLE>" + Titulo + "</TITLE></HEAD>" +
						"<BODY BGCOLOR=\"#6699AA\">" +
						"<H1 ALIGN=\"CENTER\">" + Titulo + "</H1>" +
						"<UL>" +
						"<LI><B>Primeiro parâmetro: </B>: "
						+ request.getParameter("param1") +
						"<LI><B>Segundo parâmetro: </B>: "
						+ request.getParameter("param2") +
						"</UL>" +
						"</BODY></HTML>"
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
