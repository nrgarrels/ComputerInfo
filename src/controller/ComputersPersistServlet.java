package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Computers;


/**
 * Servlet implementation class ClassroomPersistServlet
 */
@WebServlet({"/persistComputers"})
public class ComputersPersistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComputersPersistServlet() {
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
		Computers model = new Computers();
		model.setManufacturer(request.getParameter("manufacturer"));
		model.setType(request.getParameter("type"));
		model.setOs(request.getParameter("os"));
		ComputerHelper controller = new ComputerHelper();
		try {
			controller.persistComputers(model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
