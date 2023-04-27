package br.com.codandosimples.servlets;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.infra.ConnectionFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
@WebServlet("/RemoverDespesa")
public class RemoveDespesaSevlet extends HttpServlet {
    @Override
    protected  void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Connection connection = ConnectionFactory.getConnection();
        DespesaDAO dao = new DespesaDAO(connection);
        dao.delete(Long.valueOf(id));
        RequestDispatcher dispatcher= request.getRequestDispatcher("/lista-despesas-scriptlet.jsp");
        dispatcher.forward(request, response);
    }
}
