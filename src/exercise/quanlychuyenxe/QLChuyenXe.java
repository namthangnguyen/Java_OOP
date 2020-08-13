package exercise.quanlychuyenxe;

import java.util.Scanner;

public class QLChuyenXe {
    public static void main(String[] args) {
        int x;
        Scanner a = new Scanner(System.in);
        DSChuyenXe dscx = new DSChuyenXe();
        do {
            System.out.println("\n\t-----------------------------------");
            System.out.println("\t0. Exit");
            System.out.println("\t1. Them Chuyen Xe Noi Thanh");
            System.out.println("\t2. Them Chuyen Xe Ngoai Thanh");
            System.out.println("\t3. Hien thi danh muc Chuyen Xe");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            x = a.nextInt();
            System.out.println("------>>");
            switch(x)
            {
                case 1:
                    dscx.addCX(1);
                    break;
                case 2:
                    dscx.addCX(2);
                    break;
                case 3:
                    dscx.xuat();
                    break;
            }
        } while(x!=0);
        System.out.println("");
    }
}
