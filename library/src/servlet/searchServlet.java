package servlet;

import dao.bookdao;
import model.book;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/search")
public class searchServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String ISBN = request.getParameter("ISBN");
        bookdao a = new bookdao();
        try {
            List<book> list = a.find(ISBN);
            request.setAttribute("list",list);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
