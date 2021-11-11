package web.service;

import web.modell.Car;

import java.util.List;

public interface CarService {
     List<Car> allCars();
     List<Car> showSpecifiedCarsValue(int value);
}
