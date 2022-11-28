package dao;

import models.NhanVienModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class NhanVienDAO {
    public ArrayList<NhanVienModel> getList() {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT * FROM nhanvien";
            PreparedStatement ps;
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<NhanVienModel> nhanviens = new ArrayList<>();
            while (rs.next()) {
                NhanVienModel nhanvien = new NhanVienModel();
                nhanvien.setId(rs.getInt("idnv"));
                nhanvien.setName(rs.getString("tennv"));
                nhanvien.setIdpb(rs.getInt("idpb"));
                nhanvien.setAddress(rs.getString("diachi"));
                nhanviens.add(nhanvien);
            }
            return nhanviens;
        } catch (Exception e) {
            return null;
        }
    }
    public NhanVienModel getNhanVienById(int idnv) {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT * FROM nhanvien WHERE idnv = ?";
            PreparedStatement ps;
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, idnv);
            ResultSet rs = ps.executeQuery();
            NhanVienModel nhanvien = new NhanVienModel();
            while (rs.next()) {
                nhanvien.setId(rs.getInt("idnv"));
                nhanvien.setName(rs.getString("tennv"));
                nhanvien.setIdpb(rs.getInt("idpb"));
                nhanvien.setAddress(rs.getString("diachi"));
            }
            return nhanvien;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean createNhanVien(String tennv, int idpb, String diachi) {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "INSERT INTO nhanvien  (tennv, idpb, diachi) values (?,?,?)";
            PreparedStatement ps;
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, tennv);
            ps.setInt(2, idpb);
            ps.setString(3, diachi);
            ps.executeUpdate();
            con.close();
            return true;
        }catch (Exception e){
            System.out.print(e);
            return false;
        }
    }

    public boolean deleteNhanVien(int idnv) {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "DELETE FROM nhanvien WHERE idnv = ?";
            PreparedStatement ps;
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, idnv);
            ps.executeUpdate();
            con.close();
            return true;
        }catch (Exception e){
            System.out.print(e);
            return false;
        }
    }
}
