package models;

public class ElectroCar extends Car {

    int batteryCapacity;

    public ElectroCar(int year, int horsePower, String brand, int batteryCapacity, boolean move, int idx) {
        super(year, horsePower, brand, move, idx);

        this.batteryCapacity = batteryCapacity;

    }

    @Override
    public void drive() {
        System.out.println("тесла летит");
    }
    public void stop () {System.out.println(brand +" остановился. Заряд батареи: " + batteryCapacity + "%");}

    @Override
    public void load() {
    System.out.println(brand + "Загружается. Ёмкость батареи: " + batteryCapacity + "кВтч");
    }

    public void charge(int batteryCapacity){
        System.out.println(brand+ " заряжен на:"+ batteryCapacity + "% " + "Едет " );
}
}

