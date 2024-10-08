package UTSOOP.nomor3;

public class MainPembayaran {
    public static void main(String[] args) {
        kartuKredit k=new kartuKredit();
        k.setNoTransaksi(10001);
        k.setNomiTransaksi(50000);
        k.validasiPembayaran(12345);
        System.out.println();
        dompetDigital d=new dompetDigital();
        d.setNoTransaksi(11001);
        d.setNomiTransaksi(50000);
        d.validasiPembayaran(100000);
        System.out.println();
        transferBank t=new transferBank();
        t.setNoTransaksi(12001);
        t.setNomiTransaksi(50000);
        t.validasiPembayaran(88008);
    }
}
