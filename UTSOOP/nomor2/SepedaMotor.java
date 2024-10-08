package UTSOOP.nomor2;

public class SepedaMotor extends Kendaraan{
    private int kecepatan;

    public SepedaMotor(int kecepatan){
        this.kecepatan=kecepatan;
    }

    void bergerak(){
        System.out.println("Motor melaju dengan kecepatan "+kecepatan+" km/jam");
    }
}
