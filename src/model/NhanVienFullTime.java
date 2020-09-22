package model;

import util.Configs;

public class NhanVienFullTime extends NhanVien {
    int ngayLamThem;
    int loaiChucVu;

    public NhanVienFullTime(String ten){
        super(ten);
        this.loaiChucVu = Configs.NHAN_VIEN_LINH;
    }

    public NhanVienFullTime(String ten, int ngayLamThem){
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = Configs.NHAN_VIEN_LINH;
    }

    public void setLoaiChucVu(int loaiChucVu){
        this.loaiChucVu = loaiChucVu;
    }
    public void tinhLuong(){
        if (loaiChucVu == Configs.NHAN_VIEN_SEP){
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP * Configs.LUONG_LAM_THEM_MOT_NGAY ;
        }else if (loaiChucVu == Configs.NHAN_VIEN_LINH){
            luong = Configs.LUONG_NHAN_vIEN_FULL_TIME_LINH;
        }

    }
    public String loaiNhanVien(){
        if (loaiChucVu == Configs.NHAN_VIEN_LINH){
            return "Nhan vien toan thoi gian" ;
        }else {
            return "Giam doc ";
        }
    }

}
