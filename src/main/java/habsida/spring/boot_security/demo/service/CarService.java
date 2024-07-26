package habsida.spring.boot_security.demo.service;

import habsida.spring.boot_security.demo.model.Car;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = Arrays   .asList(
            new Car("Toyota", "Corolla", 2020),
            new Car("Honda", "Civic", 2019),
            new Car("Ford", "Focus", 2018),
            new Car("BMW", "3 Series", 2021),
            new Car("Audi", "A4", 2022)
    );

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
