package repositories;

import interfaces.Repository;
import models.ElectroCar;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Optional;

public class CarElectroRepository implements Repository<ElectroCar, Integer>{
    private List<ElectroCar> cars = new ArrayList<>();

    @Override
    public ElectroCar save(ElectroCar car) {
        cars.add(car);
        return car;
    }

    @Override
    public List<ElectroCar> saveAll(Collection<ElectroCar> entities) {
        cars.addAll(entities);
        return new ArrayList<>(entities);
    }

    @Override
    public Optional<ElectroCar> findById(Integer id) {
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

    public void deleteAll(int i) {
    }
}