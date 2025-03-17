package repository;

/*
CRUD - операции
- Create (создание) - добавление новых данных (новые объекты сущностей).
- Read (чтение) - получение (чтение) данных из хранилища.
- Update (обновление) - изменение существующих данных.
- Delete (удаление) - удаление объекта.
 */


import model.Car;
import utils.MyList;

public interface CarRepository {

    // Create - add
    Car addCar(String model, int year, double price);

    // Read

    // получить список всех машин
    MyList<Car> getAllCars();

    // получение сущности по id
    Car getById(int id);

    // получить список только свободных машин

    // получить список машин по модели
    MyList<Car> getCarsByModel(String model);

    // Update
    // Сохранить обновлённый объект
    void saveCar(Car car);

    // Delete
    void deleteById(int id);

}
