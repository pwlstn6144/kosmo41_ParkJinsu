package com.study.jsp.chatt;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/wait")
public class wait extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DataSource dataSource = null;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
    public wait() {
    	try
		{
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
       
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		System.out.println("dopost");
		actionDo(request, response);
		
	}
	
	private String actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();		
		request.setCharacterEncoding("UTF-8");
		ArrayList<String> list = new ArrayList<>();
		String json = "";
		try 
		{
			con = dataSource.getConnection();
			String query = "select waitroom from room where waitroom is not null";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				list.add(rs.getString("waitroom"));
			}
			
			
		
		}
		catch(Exception e) {
			System.out.println("insert fail");
			e.printStackTrace();
			writer.println("[{\"result\":\"fail\",\"desc\":\"비밀번호가 틀렸습니다.\"}]");
		}
		finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			} catch(Exception e) {}
		}
		return json;
	}

}
