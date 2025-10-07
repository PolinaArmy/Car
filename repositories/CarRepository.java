package repositories;

import interfaces.Repository;
import models.Car;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Optional;

public class CarRepository implements Repository<Car, Integer> {
    private List<Car> cars = new ArrayList<>();

    @Override
    public Car save(Car car) {
        cars.add(car);
        return car;
    }

    @Override
    public List<Car> saveAll(Collection<Car> entities) {
        cars.addAll(entities);
        return new ArrayList<>(entities);
    }

    @Override
    public Optional<Car> findById(Integer id) {
        return Optional.ofNullable(cars.get(id));
    }

    @Override
    public void deleteById(Integer id) {
        cars.remove(id.intValue());

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
    public boolean existById(Integer id) {
        if (id < cars.size()) {
            return true;
        }
        else {
            return false;
        }
    }
    }