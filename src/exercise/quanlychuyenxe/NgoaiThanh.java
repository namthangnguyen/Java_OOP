package exercise.quanlychuyenxe;

import java.util.Scanner;

public class NgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgay;
    Scanner in = new Scanner(System.in);

    public NgoaiThanh() {
        super();
        this.soNgay = 0;
        this.noiDen = "";
    }

    public NgoaiThanh(String maChuyenXe, String tenTaiXe, String soXe, double doanhThu, String noiDen, int soNgay) {
        super(maChuyenXe, tenTaiXe, soXe, doanhThu);
        this.soNgay = soNgay;
        this.noiDen = noiDen;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Noi den: ");
        this.noiDen = in.nextLine();
        System.out.println("So ngay: ");
        this.soNgay = in.nextInt();
    }

    public String toString() {
        return "Chuyen xe Ngoai thanh" + super.toString() + "\nNoi Den: "
                + this.noiDen + "\nSo ngay: " + this.soNgay
                + "\nDoanh thu: " + this.doanhThu;
    }

}
