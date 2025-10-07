package models;

import repositories.CarElectroRepository;
import repositories.CarRepository;

import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Sedan sedan_0 = new Sedan(2015, 1, "Toyota", 160, true, 9);
        Sedan sedan_1 = new Sedan(2020, 1, "Porsche", 255, false, 1);

        Sedan[] sedan = new Sedan[]{sedan_0, sedan_1};
        for (int i = 0; i < sedan.length; i++) {
            sedan[i].drive();
            sedan[i].stop();
        }
        ElectroCar electroCar_0 = new ElectroCar(2020, 100, " Tesla ", 400, true, 5);
        Truck truck_0 = new Truck(2019, 80, " Patapim ", 200, true, 7);
        truck_0.drive();
        truck_0.load();
        truck_0.setLoadCapacity();

        electroCar_0.stop();
        electroCar_0.load();
        electroCar_0.charge(80);

        Car[] cars = new Car[]{truck_0, electroCar_0};
        for (int i = 0; i < cars.length; i++) {
            cars[i].charge();
        }

        CarRepository CarRepository = new CarRepository();
        CarElectroRepository ElectroRepository = new CarElectroRepository();

        CarRepository.save(sedan_0);
        CarRepository.save(sedan_1);
        CarRepository.save(truck_0);

        ElectroRepository.save(electroCar_0);

        Car[] machineList = new Car[]{sedan_0, sedan_1, electroCar_0, truck_0};
        CarRepository.saveAll(Arrays.asList(machineList));

        System.out.println("Всего машин: " + CarRepository.count());
        System.out.println("Всего электромобилей: " + ElectroRepository.count());

        Optional<ElectroCar> foundElectroCar = ElectroRepository.findById(0);
        if (foundElectroCar.isPresent()){
            System.out.println("Найден электромобиль: " + foundElectroCar.get());

            Optional<Car> foundCar = CarRepository.findById(1);
            if (foundCar.isPresent()){
                System.out.println("Найдена машина: " + foundCar.get());

                boolean exists = ElectroRepository.existById(0);
                System.out.println("Есть ли электромобиль Electro" + exists);

                boolean notExits = ElectroRepository.existById(5);
                System.out.println("Есть ли электромобиль Electro_1" + notExits);

                System.out.println("Машин было:" + CarRepository.count());
                CarRepository.deleteById(0);
                System.out.println("Машин стало: " + CarRepository.count());

                System.out.println("Электомобилей было: " + ElectroRepository.count());
                ElectroRepository.deleteAll();
                System.out.println("Электромобилей стало: " + ElectroRepository.count());
            }
        }
    }
}