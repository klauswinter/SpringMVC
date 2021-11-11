package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.modell.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CarServiceImpl implements CarService {
    CarDaoImpl carDao = new CarDaoImpl();

    @Override
    public List<Car> allCars() {
        return carDao.allCars();
    }

    @Override
    public List<Car> getCars(int value) {
        return carDao.getCars(value);
    }
}
