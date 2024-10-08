package UTSOOP.nomor5;

class Manusia {
    private String nama;
    private int usia;
    private String alamat;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void setUsia(int usia) {
        this.usia = usia;
    }

    void tampilkanInformasi(){
        System.out.println("Nama: "+nama);
        System.out.println("Usia: "+usia);
        System.out.println("Alamat: "+alamat);
    }
}
