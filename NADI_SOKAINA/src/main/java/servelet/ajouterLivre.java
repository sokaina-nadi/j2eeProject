package servelet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;

/**
 * Servlet implementation class ajouterLivre
 */
@WebServlet("/ajouterLivre")
public class ajouterLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO um=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouterLivre() {
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
		   String namecat=request.getParameter("categ2");
		   String nameaut=request.getParameter("auteur");
		   String namelivre=request.getParameter("livre");
		   int nmbrpages=Integer.parseInt(request.getParameter("nbpage"));
		   int a=um.find(nameaut);
		   int k=um.findidcateg(namecat);
		   if(a==1) {
		   int b=um.findidaut(nameaut);
		   um.addlivre(namelivre,b, nmbrpages, k);
		
		   
	}
		   else {
			   um.addauteur(nameaut);
			   int c=um.findidaut(nameaut);
			   um.addlivre(namelivre,c, nmbrpages, k);
			   
			   
		   }

	}
}
	
