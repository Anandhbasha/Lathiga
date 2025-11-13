package com.demo;
import java.util.*;
import java.sql.*;

public class StudentDAO {
	public static int addStudent(StudentModel s) {
		int status = 0;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO newStudent(name,email,mobile,course) VALUES(?,?,?,?)" );
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getMobile());
			ps.setString(4, s.getCourse());
			status = ps.executeUpdate();
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public static List<StudentModel>getAllStudents(){
		Connection con = DBConnection.getConnection();
		List<StudentModel> list = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement(
					"SELECT * FROM newStudent");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				StudentModel s = new StudentModel();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setMobile(rs.getString(4));
				s.setCourse(rs.getString(5));
				list.add(s);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
				
	}
	public static StudentModel getStudentById(int id) {
		StudentModel s = null;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"SELECT * FROM newStudent WHERE id=?");
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();			
			if(rs.next()) {
				s = new StudentModel();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setMobile(rs.getString(4));
				s.setCourse(rs.getString(5));				
			}
			con.close();	

		}catch(Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public static int updateStudent(StudentModel s) {
		int status =0;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"UPDATE  newStudent SET name=?,email=?,mobile=?,course=? WHERE id=?");
			
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getMobile());
			ps.setString(4, s.getCourse());
			status = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int deleteStudentById(int id) {
		int status = 0;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"DELETE FROM newStudent WHERE id=?");
			ps.setInt(1,id);
			status = ps.executeUpdate();			
			con.close();	

		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
