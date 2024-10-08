package UTSOOP.nomor5;

public class Ruangan {
    int nomorRuangan;
    int kapasitas;

    Ruangan(int nomor, int kapasitas){
        this.nomorRuangan=nomor;
        this.kapasitas=kapasitas;
    }

    void tambahPasien(Pasien p){
        p.hashCode();
        try {
            if (kapasitas<kapasitas) {
                kapasitas=kapasitas+Integer.getInteger(p);
                System.out.println("Pasien telah dimasukkan ke kamar "+nomorRuangan);
            }
        } catch (Exception e) {
            System.out.println("Kamar "+nomorRuangan+" sudah penuh!");
        }
            
    }
}
