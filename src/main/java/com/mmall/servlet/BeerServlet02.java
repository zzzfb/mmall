package com.mmall.servlet;

import com.mmall.model.BeerSuggest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BeerServlet02 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        String color=req.getParameter("color");
        BeerSuggest bs=new BeerSuggest();
        List<String> brands=bs.getBrands(color);
        for(String item:brands){
            out.println("<br>"+item);
        }
    }
}
