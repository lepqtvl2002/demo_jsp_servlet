package models;

public class NhanVienModel {
    private int idnv;
    private String tennv;
    private int idpb;
    private String diachi;

    public NhanVienModel() {

    }

    public NhanVienModel(String tennv, int idpb, String diachi) {
        this.tennv = tennv;
        this.idpb = idpb;
        this.diachi = diachi;
    }

    public void setId(int idnv) {
        this.idnv = idnv;
    }

    public int getId() {
        return this.idnv;
    }

    public void setName(String tennv) {
        this.tennv = tennv;
    }

    public String getName() {
        return this.tennv;
    }

    public void setIdpb(int idpb) {
        this.idpb = idpb;
    }

    public int getIdpb() {
        return this.idpb;
    }

    public void setAddress(String diachi) {
        this.diachi = diachi;
    }

    public String getAddress() {
        return this.diachi;
    }
}
