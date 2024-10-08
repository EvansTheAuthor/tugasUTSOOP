package UTSOOP.nomor4;

public class Gudang {
    String lokasiGudang;
    String daftarProduk;

    Produk produk;
    Gudang(String lokasi, String daftar, Produk produk){
        this.lokasiGudang=lokasi;
        this.daftarProduk=daftar;
        this.produk=produk;
    }

    Gudang g;
    public void tampilkan(){
        System.out.println(g.lokasiGudang);
        System.out.println(g.daftarProduk);
        System.out.println(g.produk.namaProduk);
        System.out.println(g.produk.kategori.namaKategori);
        System.out.println(g.produk.stok);
        System.out.println(g.produk.harga);
        }
}
