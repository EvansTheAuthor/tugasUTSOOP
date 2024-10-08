package UTSOOP.nomor4;

public class Produk {
    String namaProduk;
    int harga;
    int stok;

    Kategori kategori;
    Produk(String nama, int harga, int stok, Kategori kategori){
        this.namaProduk=nama;
        this.harga=harga;
        this.stok=stok;
        this.kategori=kategori;
    }
}
