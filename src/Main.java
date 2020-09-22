import model.NhanVien;
import model.NhanVienFullTime;
import model.NhanVienPartTime;
import util.Configs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NhanVienFullTime SEP = new NhanVienFullTime("Tuan");
        SEP.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime LINH = new NhanVienFullTime("Khanh");
        LINH.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienPartTime LINH1 = new NhanVienPartTime("Duy",6);
        SEP.tinhLuong();
        LINH.tinhLuong();
        LINH1.tinhLuong();

        SEP.xuatThongTin();
        LINH.xuatThongTin();
    }

}
