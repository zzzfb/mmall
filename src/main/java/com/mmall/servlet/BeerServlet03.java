package com.mmall.servlet;

import com.mmall.model.BeerSuggest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BeerServlet03 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color=req.getParameter("color");
        BeerSuggest bs=new BeerSuggest();
        List<String> brands=bs.getBrands(color);
        req.setAttribute("brands",brands);
        RequestDispatcher view=req.getRequestDispatcher("beer.jsp");
        view.forward(req,resp);
    }
}
