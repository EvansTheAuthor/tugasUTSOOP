package UTSOOP.nomor3;

public class transferBank extends Transaksi implements Pembayaran{
    void setNoTransaksi(int nomorTransaksi){
        this.nomorTransaksi=nomorTransaksi;
    }

    void setNomiTransaksi(int nominalTransaksi){
        this.nominalTransaksi=nominalTransaksi;
    }

    @Override
    public void validasiPembayaran(int noRekening) {
        System.out.println("Transfer Berhasil!");
        System.out.println("Nomor Rekening Tujuan: "+noRekening);
        System.out.println("Nomor Transaksi: "+nomorTransaksi);
        System.out.println("Nominal Transaksi: Rp"+nominalTransaksi);
        System.out.println("Transfer sebesar Rp"+nominalTransaksi+
        " ke rekening "+noRekening+" berhasil dilakukan");
    }
}
