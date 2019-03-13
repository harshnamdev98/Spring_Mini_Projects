package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EspnFindScoreService;

public class MainControllerServlet extends HttpServlet {
	private ApplicationContext ctx;
	private EspnFindScoreService espnService=null;
	
	
	@Override
	public void init() throws ServletException {
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get LocalService class object
		espnService=ctx.getBean("espnService",EspnFindScoreService.class);
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int mid=0;
		String score=null;
		RequestDispatcher rd=null;
		//read additonal req param values
		mid=Integer.parseInt(req.getParameter("mid"));
	    try{
		//invoke b.method of LocalService class obj
	      	score=espnService.findScore(mid);
	      	req.setAttribute("scoreCard",score);
        //forward request to view_score.jsp
	      	rd=req.getRequestDispatcher("/view_score.jsp");
	      	rd.forward(req,res);
	    }
	    catch(IllegalArgumentException iae){
	    	rd=req.getRequestDispatcher("/error.jsp");
	    	req.setAttribute("errMsg",iae.getMessage());
	    	rd.forward(req,res);
	    }
		
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	
	@Override
	public void destroy() {
		espnService=null;
		((AbstractApplicationContext) ctx).close();
	
	}

}
