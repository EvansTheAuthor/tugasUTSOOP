package UTSOOP.nomor2;

abstract class Kendaraan {
    private int kecepatanMaks;
    
    void bergerak(){
        System.out.println("Kendaraan melaju dengan kecepatan "+kecepatanMaks+" km/jam");
    }
}
