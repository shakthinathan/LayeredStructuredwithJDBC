package com.day11programs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.day11programs.dto.LaptopSpec;


public class LaptopSpecDAOImpl implements LaptopSpecDAO{

	List<LaptopSpec>laptoplist=new ArrayList<>();
	@Override
	public LaptopSpec getLaptopSpecById(int id) {
		// TODO Auto-generated method stub
//		Connection conn;
//		try
//		{
//			conn=DButil.getDBConnection();
//			
//		}
		return null;
	}
	

	@Override
	public List<LaptopSpec> getLaptopSpecs() {
		// TODO Auto-generated method stub
		System.out.println("DAO-Laptop Specs information");
		LaptopSpec lap=new LaptopSpec();
		lap.setId(1);
		lap.setType("LG");
		lap.setSpecification("Windows Os");
		laptoplist.add(lap);
		lap=new LaptopSpec();
		lap.setId(2);
		lap.setType("DELL");
		lap.setSpecification("RAM 16GB");
		laptoplist.add(lap);
		return laptoplist;
	}

	@Override
	public List<LaptopSpec> getLaptopSpecsBytype() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LaptopSpec> deleteLaptopSpec() {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn=DButil.getDBConnection();
			Statement stmt=conn.createStatement();
			int deletecount=stmt.executeUpdate("delete from laptop where id=6");
			System.out.println("Record is deleted"+deletecount);

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null)
			{
				try {
					conn.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
		return laptoplist;
		
	}

	@Override
	public void insertLaptopSpecWithValues() {
		// TODO Auto-generated method stub
		Connection conn=null;
		try {
			conn=DButil.getDBConnection();
			Statement stmt=conn.createStatement();
			int count3=stmt.executeUpdate("insert into laptop values(8,'DELL','RAM 4GB')");
			//int count=stmt.executeUpdate("insert into laptop values(4,'LG','Windows OS')");
			//int count2=stmt.executeUpdate("insert into laptop values(5,'HP','RAM 16GB')");
			//System.out.println("Record is inserted successfully!"+count);
			System.out.println("Record is inserted "+count3);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			if(conn!=null)
			{
				try {
					conn.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public void insertLaptopSpec(LaptopSpec e) {
		// TODO Auto-generated method stub
		Connection conn=null;
		try {
			conn=DButil.getDBConnection();
			String sql="insert into laptop values(?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, e.getId());
			pstmt.setString(2, e.getType());
			pstmt.setString(3, e.getSpecification());
			
			int count1=pstmt.executeUpdate();
			
			System.out.println("Successfully inserted " + count1);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally {
			if(conn!=null)
			{
				try {
					conn.close();
				}catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		}
	}

	@Override
	public LaptopSpec findLaptopSpecById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LaptopSpec> getLaptopSpecs1() {
		// TODO Auto-generated method stub
		Connection conn;
		List<LaptopSpec>laplist=new ArrayList<LaptopSpec>();
		System.out.println("In Service selecting the specifications");
		try {
			conn=DButil.getDBConnection();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select id,type,specification from laptop");
			while(rs.next())
			{
				LaptopSpec laptop=new LaptopSpec();
				laptop.setId(rs.getInt("id"));
				laptop.setType(rs.getString("type"));
				laptop.setSpecification(rs.getString("specification"));
				laplist.add(laptop);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return laplist;
	}


	@Override
	public List<LaptopSpec> updateLaptopSpec() {
		// TODO Auto-generated method stub
		Connection conn;
		List<LaptopSpec>laplist=new ArrayList<LaptopSpec>();
		try {
			conn=DButil.getDBConnection();
			String sql="update laptop set specification='Processor Inteli4 RAM 16GB' where id=4";
			PreparedStatement p=conn.prepareStatement(sql);
			p.execute();
			System.out.println("Updated the info");
			
		}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		return laplist;
	}

}
