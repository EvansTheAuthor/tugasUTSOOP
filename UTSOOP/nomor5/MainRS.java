package UTSOOP.nomor5;

public class MainRS {
    public static void main(String[] args) {
        Pasien p=new Pasien(1234);
        p.setNama("Samsul");
        p.setUsia(17);
        p.setAlamat("Surabaya");

        Dokter d=new Dokter();
        d.diagnosaPenyakit(p);
        p.tampilkanInformasi();

        Ruangan k=new Ruangan(102, 1);
        k.tambahPasien(p);
        k.tambahPasien(p);
    }
}
