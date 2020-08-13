package exercise.quanlychuyenxe;

import java.util.Scanner;

public class ChuyenXe {
    protected String maChuyenXe, tenTaiXe, soXe;
    protected double doanhThu;
    Scanner in = new Scanner(System.in);

    protected double getDoanhThu() {
        return doanhThu;
    }

    protected void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    protected ChuyenXe() {
        this.maChuyenXe = "";
        this.tenTaiXe = "";
        this.soXe = "";
        this.doanhThu = 0;
    }

    // Cứ có hàm khởi tạo là hàm khởi tạo mặc định sẽ mất => nếu muốn để mặc định thì phải viết lại
    protected ChuyenXe(String maChuyenXe, String tenTaiXe, String soXe, double doanhThu) {
        this.maChuyenXe = maChuyenXe;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    protected void nhap() {
        System.out.println("Nhap MaSo Chuyen xe: ");
        this.maChuyenXe = in.nextLine();
        System.out.println("HoTen Tai xe: ");
        this.tenTaiXe = in.nextLine();
        System.out.println("BienSo xe: ");
        this.soXe = in.nextLine();
        System.out.println("Doanh thu:");
        this.doanhThu = in.nextDouble();
    }

    public String toString() {
        return "\nMa So chuyen: " + this.maChuyenXe + "\nTen Tai Xe: " + this.tenTaiXe
                + "\nBien so Xe: " + this.soXe;
    }

}
