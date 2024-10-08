package UTSOOP.nomor2;

public class Mobil extends Kendaraan{
    private int kecepatan;

    public Mobil(int kecepatan){
        this.kecepatan=kecepatan;
    }

    void bergerak(){
        System.out.println("Mobil melaju dengan kecepatan "+kecepatan+" km/jam");
    }
}
