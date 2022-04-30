package br.com.alura.maven.lojaweb;

import br.com.alura.maven.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/contato"})
public class ContatoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Produto produto = new Produto("Maçã", 1.1);

        PrintWriter writer = resp.getWriter();
        writer.println("<html><h2>Fale conosco</h2><h3>"+produto.getNome()+"</h3></html>");
        writer.close();
    }
}
