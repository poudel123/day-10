package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/currency")
public class CurrencyConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CurrencyConverterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//or <table border='1'>
		out.println("<table style='border: 1px solid black'> ");
		
		out.println("<tr><th> INDIAN </th><th> DOLLAR </th></tr>");
		for (int i=1;i<=50;i++)
		{
			//int result;
			//result= i*45;
			out.println("<tr><td>" + i + "</td> <td>" + i*45 + "</td></tr>");
			
			
		}
		out.println("</table>");
		out.close();
		
	}

}
