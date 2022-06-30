package br.com.prefeitura.diadema.repository.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Oracle {
	private  String password ="";
	private  String user = "";
	private  String SERVER = "10.1.2.94";
	private  String PORT ="1521";
	private  String DATABESE="siap";
	private Connection connection;
	
	
	public Oracle(String user, String password){
		this.password = password;
		this.user = user;
	}
	
	
	public Integer execute(String sql) throws SQLException{
		if(connection == null){
			connection(user,password);
		}
		Statement stmt = connection.createStatement();		
		int x = stmt.executeUpdate (sql);		
		return x;
	}
	
	
	public ResultSet executeQuery(String sql) throws SQLException{
		if(connection == null){
			connection(user,password);
		}
		Statement stmt = connection.createStatement();
		ResultSet res = stmt.executeQuery(sql);
		return res;
	}
	
	public void executeUpdate(){
		if(connection == null){
			connection(user,password);
		}
	}
	
	private void connection(String user, String passwd){
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 String url = "jdbc:oracle:thin:@" + SERVER + ":" + PORT + ":" + DATABESE;
			 connection = DriverManager.getConnection(url, user, passwd);
		 
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
	}
}
