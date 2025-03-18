package repository;

import model.Car;
import utils.MyArrayList;
import utils.MyList;

import java.util.concurrent.atomic.AtomicInteger;

public class CarRepositoryImpl implements CarRepository {

    // Все машины будут хранится в памяти нашего приложения.
    private final MyList<Car> cars;

    // Объект, отвечающий за генерацию уникальных id.
    private final AtomicInteger currenId = new AtomicInteger(1);

    public CarRepositoryImpl() {
        this.cars = new MyArrayList<>();
        addStartCars();
    }

    private void addStartCars() {
        cars.addAll(new Car(currenId.getAndIncrement(), "VW Golf", 2021, 20000.00), new Car(currenId.getAndIncrement(), "VW Golf", 2019, 15500.00), new Car(currenId.getAndIncrement(), "VW Passat", 2022, 30000.00), new Car(currenId.getAndIncrement(), "VW Passat", 2020, 24300.00), new Car(currenId.getAndIncrement(), "VW Tiguan", 2023, 35000.00));
    }

    @Override
    public Car addCar(String model, int year, double price) {
        // Слой репозитория НЕ должен делать ни какие проверки. Это задача сервисного слоя.
        // if (model == null) return null;
        Car car = new Car(currenId.getAndIncrement(), model, year, price);
        cars.add(car);
        return car;
    }

    @Override
    public MyList<Car> getAllCars() {
        return cars;
    }

    @Override
    public Car getById(int id) {
        // Перебрать все машины из хранилища.
        // Если id совпадут - вернуть объект Car.
        // Если перебрал все, id ни с одной не совпали - вернуть null.
        for (Car car : cars) {
            if (car.getId() == id) return car;
        }
        return null;
    }


    // model = "VW"
    @Override
    public MyList<Car> getCarsByModel(String model) {
        MyList<Car> result = new MyArrayList<>();
        // Перебираю список машин, если модель совпала (или частично совпала)
        // добавить ее в result
        // equals vs contains
        for (Car car : cars) {
//            if (car.getModel().equalsIgnoreCase(model)) {
//                result.add(car);
//            }
            if (car.getModel().contains(model)) {
                result.add(car);
            }
        }
        return result;
    }

    @Override
    public void saveCar(Car car) {

    }

    @Override
    public void deleteById(int id) {

    }
}
