package soal1;

public class Restaurant {
    /*public String[] nama_makanan;
    public double[] harga_makanan;
    public int[] stok;*/
    public static byte id=0;
    private makanan[] MenuMakan;
public Restaurant() {
    /*nama_makanan = new String[10];
    harga_makanan = new double[10];
    stok = new int[10];*/
    MenuMakan = new makanan[10];
}
public void tambahMenuMakanan(String nama, double harga, int stok) {
    /*this.nama_makanan[id] = nama;
    this.harga_makanan[id] = harga;
    this.stok[id] = stok;*/
    this.MenuMakan[id] = new makanan(nama, harga, stok);
}
public void tampilMenuMakanan(){
    for(int i =0; i<=id;i++){
        if(!isOutOfStock(i)){
            //System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            this.MenuMakan[i].TampilMakan();
        }
    }
}
public boolean isOutOfStock(int id){
        return MenuMakan[id].getStok() == 0;
    }

public static void nextId(){
    id++;
    }
public void pesanan (String nama, int stok){
    for(int i=0; i<=id;i++){
        if(nama.equals(MenuMakan[i].getNamaMkn())){
            if(MenuMakan[i].getStok() >= stok){
          System.out.println(stok + " " + MenuMakan[i].getNamaMkn() + " " + "Terjual!");
            MenuMakan[i].noStok(stok);
            }
            else System.out.println("Stok" + MenuMakan[i].getNamaMkn() + "tidak cukup !");
            }
        }
    }
}
