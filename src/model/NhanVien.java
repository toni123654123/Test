package model;

public class NhanVien {
    protected String ten;
    protected long luong;


    public NhanVien(String ten) {
        this.ten = ten;
    }

    public NhanVien(long luong) {
        this.luong = luong;
    }

    public void xuatThongTin(){
        System.out.println("Ten nhan vien: " + ten);
        System.out.println("Luong cua nhan vien: " + luong);

    }
    protected String loaiNhanVien(){

        return null;
    }
}
