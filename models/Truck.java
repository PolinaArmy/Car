package models;

import interfaces.Truckable;

public class Truck extends Car implements Truckable {
    int loadCapacity;
    int maxCapacity;
    public Truck(int year, int horsePower, String brand, int loadCapacity,boolean move, int idx) {
        super(year, horsePower, brand, move, idx);
            this.loadCapacity = loadCapacity;
            this.maxCapacity = Truckable.maxCapacity;
    }
    @Override
    public void drive(){
        System.out.println(brand);
}
    public void stop () {System.out.println(brand+" остановка");}

    public void setLoadCapacity() {

        this.loadCapacity = loadCapacity;
    }
    @Override
    public void load (){
        System.out.println(brand + " Загружается " + Capacity + " единиц ");
        System.out.println("максимальная вместимость " + maxCapacity);
}
}


