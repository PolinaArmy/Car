//package repositories;
//
//import models.Car;
//
//public class CarRepositoryOld {
//    Car[] cars = new Car[4];
//    int count = 0;
//
//    public void getCars(String brand) {
//        for (int i = 0; i < count; i++) {
//            if (cars[i].brand.equals(brand)) {
//                System.out.println(cars[i]);
//            }
//        }
//    }
//
//    public void addCar(Car car) {
//        if (count < cars.length) {
//            cars[count] = car;
//            count++;
//        }
//    }
//
//    public void delCar(int idx) {
//        if (idx >= 0 && idx < count) {
//            for (int i = idx; i < count - 1; i++) {
//                cars[i] = cars[i + 1];
//            }
//            cars[count - 1] = null;
//            count--;
//        }
//    }
//}