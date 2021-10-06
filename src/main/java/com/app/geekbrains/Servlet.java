package com.app.geekbrains;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Servlet", urlPatterns = "/catalog")
public class Servlet extends HttpServlet {

    // http://localhost:8080/catalog?amount=5
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // получение количества выводимых товаров из GET запроса
        int amount;
        try {
            amount = Math.abs(Integer.parseInt(req.getParameter("amount")));
            if (amount > 10) amount = 10;
        } catch (NumberFormatException e) {
            amount = 10;
        }

        out.printf("<html><body><h1 style='color:red'>List of " +
                amount + " products:</h1></body></html>");

        String prefix = "<html><body><p style='font-size:20px;'>";
        String suffix = "</p></body></html>";
        List<Product> catalog = ProductDB.getCatalog();

        // вывод amount товаров
        for (int i = 0; i < amount; i++) {
            Product product = catalog.get(i);
            int id = product.getId();
            String title = product.getTitle();
            double cost = product.getCost();

            out.printf(prefix + " №" + id + ". " + title + ", " + cost + "$" + suffix);
        }
        out.close();
    }
}
