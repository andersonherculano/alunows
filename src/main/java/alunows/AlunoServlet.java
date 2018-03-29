package alunows;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/aluno", "/alunoServlet"})
public class AlunoServlet extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Chamou pelo m�todo GET");
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//Envia mensagem para o servidor
			//System.out.println("Chamou pelo m�todo POST");
			
			//Envia mensagem para o cliente
			resp.setCharacterEncoding("UTF-8");
			resp.getWriter().print("Chamou pelo m�todo POST no cliente");
		}
		
		@Override
		protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setCharacterEncoding("UTF-8");
			resp.getWriter().print("Chamou pelo m�todo PUT no cliente");
		}
		
		@Override
		protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setCharacterEncoding("UTF-8");
			resp.getWriter().print("Chamou pelo m�todo DELETE no cliente");
		}
}
