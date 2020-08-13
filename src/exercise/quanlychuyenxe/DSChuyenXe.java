package exercise.quanlychuyenxe;

public class DSChuyenXe {
    private ChuyenXe[] CX = new ChuyenXe[100];
    private int countCX;
    private double sum1 = 0, sum2 = 0;

    public DSChuyenXe() {
        countCX = 0;
        for (int i = 0; i < 100; i++) {
            CX[i] = new ChuyenXe();
        }
    }

    public void addCX(int temp) {
        if (countCX > 100)
            System.out.println("Khong the them du lieu!");
        else {
            if (temp == 1) {
                CX[countCX] = new NoiThanh();
                CX[countCX].nhap();
                sum1 += CX[countCX].getDoanhThu();
            } else {
                CX[countCX] = new NgoaiThanh();
                CX[countCX].nhap();
                sum2 += CX[countCX].getDoanhThu();
            }
            countCX++;
        }
    }

    public void xuat() {
        for (int i = 0; i < countCX; i++) {
            System.out.println("------------/---------------/------------");
            System.out.println(CX[i].toString());
        }

        System.out.println("----------------Doanh Thu-----------------");
        System.out.println("| Chuyen Xe Noi Thanh: " + sum1 + "|");
        System.out.println("| Chuyen Xe Ngoai Thanh: " + sum2 + "|");
        System.out.println("------------------------------------------");
    }
}
