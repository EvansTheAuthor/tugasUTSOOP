package UTSOOP.nomor2;

public class MainKendaraan {
    public static void main(String[] args) {
        Kendaraan truk=new Truk(1000, 60);
        truk.bergerak();

        Kendaraan mobil=new Mobil(80);
        mobil.bergerak();

        Kendaraan spdMotor=new SepedaMotor(70);
        spdMotor.bergerak();
    }
}
