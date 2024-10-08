package UTSOOP.nomor4;

public class MainPerusahaan {
    public static void main(String[] args) {
        Kategori k=new Kategori();
        k.daftarProduk="";
        k.namaKategori="makanan";
        Produk p=new Produk("BIskuit", 500, 500, k);
        Gudang g=new Gudang("Surabaya", "50", p);

        try {
            System.out.println(g.lokasiGudang);
            System.out.println(g.daftarProduk);
            System.out.println(g.produk.namaProduk);
            System.out.println(g.produk.kategori.namaKategori);
            System.out.println(g.produk.stok);
            System.out.println(g.produk.harga);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
