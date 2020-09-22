package model;

import util.Configs;

public class NhanVienPartTime extends NhanVien {
     private int gioLamViec;
    public NhanVienPartTime(String ten, int giolamViec){
        super(ten);
        this.gioLamViec= giolamViec;
    }
    public String loaiNhanVien(){

        return "Nhan vien part time";
    }
    public void tinhLuong(){
        luong = gioLamViec * Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO;
    }


}
