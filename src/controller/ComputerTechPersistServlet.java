package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.ComputerTech;
import model.Computers;

/**
 * Servlet implementation class StudentPersistServlet
 */
@WebServlet("/persistComputerTech")
public class ComputerTechPersistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComputerTechPersistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ComputerTech model = new ComputerTech();
		Computers computerModel = new Computers();
		computerModel.setID(new Integer(request.getParameter("computerID")));
		model.setComputers(computerModel);
		model.setComputerTechName(request.getParameter("computerTechName"));
		ComputerHelper controller = new ComputerHelper();
		try {
			controller.persistComputerTech(model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}