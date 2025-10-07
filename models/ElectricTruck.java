package models;

public class ElectricTruck extends ElectroCar{
    int loadCapacity;
    int maxCapacity;
    public ElectricTruck(int year, int horsePower, String brand, int batteryCapacity, boolean move, int idx) {
        super(year, horsePower, brand,batteryCapacity ,move, idx);
        System.out.println("загрузка на"+loadCapacity);
    }
}
