package service;

import model.Car;
import model.User;
import utils.MyList;

public interface MainService {

    User registerUser(String email, String password);

    boolean loginUser(String email, String password);

    void logOut();

    boolean takeCar(int carId);

    Car addCar(String model, int year, double price);

    MyList<Car> getAllCars();

    MyList<Car> getCarsByModel(String model);

    MyList<Car> getFreeCars();

    void deleteCar(int carId);




}
