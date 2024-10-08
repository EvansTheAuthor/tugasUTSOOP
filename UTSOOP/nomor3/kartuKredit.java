package UTSOOP.nomor3;

class kartuKredit extends Transaksi implements Pembayaran{
    void setNoTransaksi(int nomorTransaksi){
        this.nomorTransaksi=nomorTransaksi;
    }

    void setNomiTransaksi(int nominalTransaksi){
        this.nominalTransaksi=nominalTransaksi;
    }

    public void validasiPembayaran(int nomorKartu){
        System.out.println("Nomor kartu telah valid!");
        System.out.println("Nomor kartu: "+nomorKartu);
        System.out.println("Nomor Transaksi: "+nomorTransaksi);
        System.out.println("Nominal Transaksi: Rp"+nominalTransaksi);
        System.out.println("Rp"+nominalTransaksi+" ditambahkan dalam "+
        "tagihan rekening Anda");
    }
}
