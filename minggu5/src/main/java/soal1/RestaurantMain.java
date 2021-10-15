package soal1;
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
    Restaurant menu = new Restaurant();
    Scanner sc = new Scanner(System.in);
    String makanan;
    int pesanan;
    
    System.out.println("-------Menu----------");
    menu.tambahMenuMakanan("Bala-Bala",1_000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Gehu",1_000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Tahu",1_000, 0);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Molen",1_000, 20);
    menu.tampilMenuMakanan();
    System.out.println("--------------------");
    
    System.out.println("Masukan nama makanan :");
    makanan = sc.nextLine();
    System.out.println("Jumlah makanan yang dibeli :");
    pesanan = sc.nextInt();
     System.out.println("--------------------");
    menu.pesanan(makanan, pesanan);
    System.out.println("Stok makanan tersisa");
    menu.tampilMenuMakanan();
    }
}

