package com.nt.mod1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class GetEmpCountTest {
  private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP";
	public static void main(String[] args) {
		InputStream is=null;
		Properties props=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		int count=0;
		try{
		   //Locate properties file
			is=new FileInputStream("src/com/nt/commons/jdbc.properties");
			//create obj for java.util.Properties
			props=new Properties();
			//load properties file content to java.util.Properties class obj
			props.load(is);
			//load jdbc driver class
			Class.forName(props.getProperty("jdbc.driver"));
			//establish the connection
			con=DriverManager.getConnection(props.getProperty("jdbc.url"),props.getProperty("jdbc.user"),props.getProperty("jdbc.pwd"));
			//create STatement object
			st=con.createStatement();
			//send and execute SQL Query
			rs=st.executeQuery(GET_EMP_COUNT);
			//process theResultSet
			if(rs.next())
				count=rs.getInt(1);
			//display the results
			System.out.println("Emps count::"+count);
		}//try
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
		
			//close jdbc objs
			try{
			if(rs!=null)
				rs.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(st!=null)
					st.close();
				}
				catch(SQLException se){
					se.printStackTrace();
				}
			try{
				if(con!=null)
					con.close();
				}
				catch(SQLException se){
					se.printStackTrace();
				}
		}//finally
	}//main
	}//class

