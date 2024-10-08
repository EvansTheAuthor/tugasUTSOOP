package UTSOOP.nomor2;

public class Truk extends Kendaraan{
    private int kapasitasMuatan;
    private int kecepatan;

    public Truk(int kapasitasMuatan, int kecepatan){
        this.kapasitasMuatan=kapasitasMuatan;
        this.kecepatan=kecepatan;
    }

    void bergerak(){
        System.out.println("Truk bergerak dengan kecepatan "+kecepatan+" km/jam");
        System.out.println("Truk mampu mengangkut muatan seberat "+kapasitasMuatan+" kg");
    }
}
