package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.ConnectionDAO;
import Models.UrunModel;

public class UrunDAO {
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static ResultSet rs = null;

	public static ArrayList<UrunModel> tumUrunleriGetir() throws SQLException {
		ArrayList<UrunModel> tumUrunler = new ArrayList<UrunModel>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("Select * from urun;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				UrunModel urun = new UrunModel();
				urun.setUrunId(rs.getInt(1));
				urun.setUrunAd(rs.getString(2));
				urun.setUrunAciklama(rs.getString(3));
				urun.setFiyat(rs.getInt(4));
				tumUrunler.add(urun);
			}
			con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				con.close();
				psmt.close();
				rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return tumUrunler;
	}

}
