package web.dao;

import web.modell.Car;

import java.util.List;

public interface CarDao {
    List<Car> allCars();
    List<Car> getCars(int value);
}
