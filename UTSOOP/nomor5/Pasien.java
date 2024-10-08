package UTSOOP.nomor5;

public class Pasien extends Manusia{
    private int noRekamMedis;
    private String riwayatPenyakit;

    Pasien(int noRekam){
        this.noRekamMedis=noRekam;
    }

    void tampilkanInformasi(){
        super.tampilkanInformasi();
        System.out.println("Nomor Rekam Medis: "+noRekamMedis);
        System.out.println("Riwayat Penyakit: "+riwayatPenyakit);
    }

    void tambahRiwayatPenyakit(String penyakit){
        if (riwayatPenyakit!=null) {
            this.riwayatPenyakit=riwayatPenyakit+", "+penyakit;
        } else {
            this.riwayatPenyakit=penyakit;
        }
        System.out.println("Penyakit berhasil ditambahkan!");
    }
}
