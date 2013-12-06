package com.maytaste.eduame.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Properties;

public class EntityGenerator {
	public static void main(String[] args) {
		String name="`email_log`";
		
		Connection conn=EntityGenerator.getConnection();
		String sql="select  * from "+name +" limit 0,0";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData md=rs.getMetaData();
			
			for (int i = 1; i <= md.getColumnCount(); i++) {
				System.out.print("private ");
				
				if(md.getColumnTypeName(i).toLowerCase().equals("int") || md.getColumnTypeName(i).toLowerCase().equals("int identity")) System.out.print("Integer");
				else if(md.getColumnTypeName(i).toLowerCase().equals("bigint") || md.getColumnTypeName(i).equals("bigint identity")) System.out.print("Long");
				else if(md.getColumnTypeName(i).toLowerCase().equals("varchar")) System.out.print("String");
				else if(md.getColumnTypeName(i).toLowerCase().equals("nvarchar")) System.out.print("String");
				else if(md.getColumnTypeName(i).toLowerCase().equals("datetime")) System.out.print("String");
				else if(md.getColumnTypeName(i).toLowerCase().equals("ntext")) System.out.print("String");
				else if(md.getColumnTypeName(i).toLowerCase().equals("nchar")) System.out.print("String");
				else if(md.getColumnTypeName(i).toLowerCase().equals("float")) System.out.print("Double");
				else if(md.getColumnTypeName(i).toLowerCase().equals("text")) System.out.print("String");
				else if(md.getColumnTypeName(i).toLowerCase().equals("numeric")) System.out.print("BigDecimal");
				else System.out.print("未识别类型:"+ md.getColumnTypeName(i).toLowerCase());;
				
				System.out.println(" "+md.getColumnName(i)+";");
			}

			System.out.println("\n\ninsert ******* ");
			
			System.out.println("insert "+name+" (");
			for (int i = 1; i <= md.getColumnCount(); i++) {
				
				System.out.print("\t"+md.getColumnName(i));
				if (i<md.getColumnCount()) {
					System.out.println(",");
				}
			}
			System.out.println("\n) values(");
			for (int i = 1; i <= md.getColumnCount(); i++) {
				
				System.out.print("\t#{"+md.getColumnName(i)+"}");
				if (i < md.getColumnCount()) {
					System.out.println(",");
				}
			}
			System.out.println("\n)");
			
			
			
			System.out.println("\n\nupdate ******* ");
			
			System.out.println("update "+name+" set ");
			for (int i = 1; i <= md.getColumnCount(); i++) {
				
				System.out.print("\t"+md.getColumnName(i));
				System.out.print("=#{"+md.getColumnName(i)+"}");
				if (i<md.getColumnCount()) {
					System.out.println(",");
				}
			}
			
			rs.close();
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection(){
		
		try {
			
			Properties p=new Properties();
			p.load(Test.class.getResourceAsStream("/datasource.properties"));
			
			Class.forName(p.getProperty("db.proxool.driver"));
			
			
			Connection conn=DriverManager.getConnection(p.getProperty("db.proxool.url")
					,p.getProperty("db.proxool.username"),p.getProperty("db.proxool.password"));
			
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
