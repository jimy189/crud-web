package br.com.codandosimples;

import br.com.codandosimples.infra.ConnectionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

//@Webservlet mapeia o caminhode um endpoint
//@WebServlet("/segundaServlet")
// @WebServlet(urlPatterns = {"/xpto", "/teste"}) mapeia
//varios caminhos para um mesmo endpoint
@WebServlet(urlPatterns = {"/xpto", "/teste", "/primeiraServlet"})
public class PrimeiraServlet extends HttpServlet {
    //A anotação @override é uma forma de garantir que
    // estamos na verdade sobrescrevendo um método e não
    // criando um novo.
    @Override
    protected  void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Primeira Pagina do Blog</h1>");
        writer.println("</body>");
        writer.println("</html>");

        Connection connection = ConnectionFactory.getConnection();


    }
}
