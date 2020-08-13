package exercise.quanlychuyenxe;

import java.util.Scanner;

public class NoiThanh extends ChuyenXe {
    private double soKm;
    private String soTuyen;
    Scanner in = new Scanner(System.in);

    public NoiThanh() {
        super();
        this.soKm = 0;
        this.soTuyen = "";
    }

    public NoiThanh(String ma, String name, String sx, double dt, String st, double skm) {
        super(ma, name, sx, dt);
        this.soTuyen = st;
        this.soKm = skm;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap So Tuyen: ");
        this.soTuyen = in.nextLine();
        System.out.println("So Km: ");
        this.soKm = in.nextDouble();
    }

    public String toString() {
        return "Chuyen Xe Noi Thanh " + super.toString()
                + "\n So Tuyen: " + this.soTuyen + "\nSo Km: " + this.soKm
                + "\nDoanh Thu: " + this.doanhThu;
    }

}
