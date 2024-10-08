package UTSOOP.nomor5;
import java.util.Scanner;
public class Dokter extends Manusia{
    Scanner scan=new Scanner(System.in);
    String spesialisasi;
    int nomorLisensi;
    String diagnosa;

    @Override
    void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Spesialisasi: "+spesialisasi);
        System.out.println("Lisensi: "+nomorLisensi);
    }

    void diagnosaPenyakit(Pasien pasien){
        System.out.print("Hasil diagnosa: ");
        diagnosa=scan.nextLine();
        pasien.tambahRiwayatPenyakit(diagnosa);
        scan.close();
    }
}
