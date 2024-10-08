package UTSOOP.nomor3;

public class dompetDigital extends Transaksi implements Pembayaran{
    void setNoTransaksi(int nomorTransaksi){
        this.nomorTransaksi=nomorTransaksi;
    }

    void setNomiTransaksi(int nominalTransaksi){
        this.nominalTransaksi=nominalTransaksi;
    }
    
    @Override
    public void validasiPembayaran(int saldo) {
        System.out.println("Saldo masih tersedia!");
        saldo=saldo-nominalTransaksi;
        System.out.println("Sisa saldo: "+saldo);
        System.out.println("Nomor Transaksi: "+nomorTransaksi);
        System.out.println("Nominal Transaksi: Rp"+nominalTransaksi);
        System.out.println("Tersisa Rp"+saldo+
        " dalam akun Anda");
    }
}
