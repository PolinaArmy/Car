package repositories;

import interfaces.Repository;
import models.Car;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Optional;
import java.util.HashMap;

public class CarRepository
implements Repository<Car, String>
    {
        Map<String, Car> cars = new HashMap<>();
        int nextId = 1;

        @Override
        public Car save(Car car) {
            String id = "Car" + nextId++;
            cars.put(id, car);
            return car;
        }

        @Override
        public List<Car> saveAll(Collection<Car> entities) {
            List<Car> savedCars = new ArrayList<>();
            for (Car car :entities) {
                savedCars.add(save(car));
            }
            return savedCars;
        }

        @Override
        public Optional<Car> findById(String id) {
            return Optional.ofNullable(cars.get(id));
        }

        @Override
        public void deleteById(String id) {
        cars.remove(id);

        }

        @Override
        public void deleteAll() {
            cars.clear();

        }

        @Override
        public long count() {
            return cars.size();
        }

        @Override
        public boolean existById(String id) {
            return cars.containsKey(id);
        }
    }
