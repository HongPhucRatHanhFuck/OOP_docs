import java.util.Scanner;

public class Rectangle {
    double chieuDai, chieuRong;

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double ChuVi(){
        return (this.chieuDai +this.chieuRong) / 2;
    }

    public double DienTich(){
        return (this.chieuDai * this.chieuRong);
    }

    public String thongTinHCN(){
        return ("Do dai chieu dai: " + chieuDai + "Do dai chieu rong la: " + chieuRong);
    }
}
class Main1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double chieuDai = scanner.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double chieuRong = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(chieuDai, chieuRong);
        System.out.println("Dien tich HCM: " + rectangle.DienTich());
        System.out.println("Chu vi HCM: " + rectangle.ChuVi());
        System.out.println("ThongTin " + rectangle.thongTinHCN());
    }
}
