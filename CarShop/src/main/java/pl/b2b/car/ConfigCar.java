package pl.b2b.car;

import com.sun.deploy.config.Config;

public class ConfigCar {

    public String nameAndPower(Car x) {


        return x.getName() + " " + x.getPower();
    }

    public double fuelCountOnXkm(Car car, double range) {


        return car.getFuelUsage() * range / 100;
    }


    public double rangeOnMaxFuel(Car car) {


        return car.getFuelCapacity() * 100 / car.getFuelUsage();
    }

    public double priceOfFuelUsedOnXkm(Car car, double range, double price) {


        ConfigCar x = new ConfigCar();

        return x.fuelCountOnXkm(car, range) * price;


    }

    public double howFastOnTopSpeedOnXkm(Car car, double range) {

        return range / car.getTopSpeed();
    }

    public String coompareTwoCarsAndChooseCarWithHigherMaxRange(Car x, Car y) {

        ConfigCar car = new ConfigCar();

        if (car.rangeOnMaxFuel(x) > car.rangeOnMaxFuel(y)) {
            return x.getName();
        } else {
            return y.getName();


        }


    }

}