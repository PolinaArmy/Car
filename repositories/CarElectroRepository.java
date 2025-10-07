package repositories;

import interfaces.Repository;
import models.ElectroCar;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Optional;
import java.util.HashMap;

public class CarElectroRepository implements Repository<ElectroCar, String>{
    Map<String, ElectroCar> electroCars = new HashMap<>();
    int nextId = 1;

    @Override
    public ElectroCar save(ElectroCar car) {
        String id = "Electro" + nextId++;
        electroCars.put(id, car);
        return car;
    }

    @Override
    public List<ElectroCar> saveAll(Collection<ElectroCar> entities) {
        List<ElectroCar> savedCars = new ArrayList<>();
        for (ElectroCar car: entities){
            savedCars.add(save(car));
        }
        return savedCars;
    }

    @Override
    public Optional<ElectroCar> findById(String id) {
        return Optional.ofNullable(electroCars.get(id));
    }

    @Override
    public void deleteById(String id) {
      electroCars.remove(id);
    }

    @Override
    public void deleteAll() {
      electroCars.clear();
    }

    @Override
    public long count() {
        return electroCars.size();
    }

    @Override
    public boolean existById(String id) {
        return electroCars.containsKey(id);
    }
}
