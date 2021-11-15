package web.dao;

import web.modell.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    private List<Car> cars = new ArrayList<>();
    private List<Car> getCars = new ArrayList<>();

    {
        Car car1 = new Car("TESLA", "X", 2020);
        Car car2 = new Car("Mazda", "6", 1995);
        Car car3 = new Car("Volvo", "XC60", 2017);
        Car car4 = new Car("Mitsubishi", "Outlander", 2013);
        Car car5 = new Car("Nissan", "Sunny", 1998);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public List<Car> allCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int value) {
        getCars.clear();

        for (int i = 0; i < value; i++) {
            getCars.add(cars.get(i));
        }

        return getCars;
    }
}
