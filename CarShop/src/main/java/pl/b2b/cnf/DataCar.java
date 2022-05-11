package pl.b2b.cnf;

import pl.b2b.car.Car;

public class DataCar {

    Car mazda;
    Car fiat;
    Car volvo;
    Car citroen;
    Car renault;
    Car skoda;
    Car volkswagen;
    Car subaru;

    public DataCar() {
        mazda = new Car("Mazda", 165, 51, 11.2, 200);
        fiat = new Car("Fiat", 120, 45, 8.7, 180);
        volvo = new Car("Volvo", 200, 55, 10.5, 250);
        citroen = new Car("Citroen", 150, 47, 10.0, 195);
        renault = new Car("Renault", 100, 52, 11.5, 160);
        skoda = new Car("Skoda", 130, 41, 13.1, 175);
        volkswagen = new Car("Volkswagen", 270, 46, 15.0, 300);
        subaru = new Car("Subaru", 300, 50, 10.5, 350);
    }

    public Car getMazda() {
        return mazda;
    }

    public Car getFiat() {
        return fiat;
    }

    public Car getVolvo() {
        return volvo;
    }

    public Car getCitroen() {
        return citroen;
    }

    public Car getRenault() {
        return renault;
    }

    public Car getSkoda() {
        return skoda;
    }

    public Car getVolkswagen() {
        return volkswagen;
    }

    public Car getSubaru() {
        return subaru;
    }
}
