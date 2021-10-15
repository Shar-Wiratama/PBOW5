package soal1;

public class makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    public makanan(String nama, double harga, int stok){
        this.nama_makanan = nama;
        this.harga_makanan = harga;
        this.stok = stok;
    }
    public String getNamaMkn(){
        return nama_makanan;
    }
    public int getStok(){
        return stok;
    }
    public void noStok(int stok){
        this.stok -= stok;
    }
    public void TampilMakan(){
        System.out.println(nama_makanan+"("+stok+")"+" Rp. "+harga_makanan);
    }
}
