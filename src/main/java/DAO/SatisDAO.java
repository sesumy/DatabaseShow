package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import Models.SatisModel;

public class SatisDAO {
private static Connection conn=null;
private static PreparedStatement psmt=null;
private static ResultSet rs=null;

	public static ArrayList<SatisModel> tumSatisGetir(){
			
		ArrayList<SatisModel> tumSatis=new ArrayList<SatisModel>();
		try{
			conn=ConnectionDAO.getConnection();
			psmt=conn.prepareStatement("Select * from satis");
			rs=psmt.executeQuery();
			while(rs.next()){
				SatisModel satis=new SatisModel();
				satis.setUrunId(rs.getInt(1));
				satis.setUserId(rs.getInt(2));
				satis.setSatisTarih(rs.getString(3));
				satis.setSatisAdet(rs.getInt(4));
				tumSatis.add(satis);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
			conn.close();
			psmt.close();
			rs.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}//FÝNALLY
		return tumSatis;
	}
}
