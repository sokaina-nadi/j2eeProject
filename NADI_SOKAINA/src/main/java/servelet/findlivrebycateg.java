package servelet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;
import POJO.livre;

/**
 * Servlet implementation class findlivrebycateg
 */
@WebServlet("/findlivrebycateg")
public class findlivrebycateg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       DAO um=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findlivrebycateg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		um=new DAO();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		   String name=request.getParameter("categ");
		   
		    
		    List<livre> us=um.findlivreBycategorie(name);
			out.print("<table width='60%' bgcolor='gold' border='2'>");
			out.print("voici les livre de Categorie:'"+name+"'");
			out.print("<thead><th>nom livre</th><th>nombre page</th></thead>");
			for (livre u : us) {
				
				out.print("<tbody>");
				out.print("<tr>");
				out.print("<td>"+u.getNomLivre()+"</td>");
				out.print("<td>"+u.getNbrPage()+"</td>");
				out.print("</tr>");
				out.print("<tbody>");
			}
			out.print("</table>");
		}

	
		
	}


