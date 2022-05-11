import java.util.ArrayList;
import java.util.List;

public class Factory {
    List<Car> cars;

    public Factory() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void printAllData() {
        for (Car car : cars) {

            System.out.println("\n" + car.getProducent().getName() + " " + car.getProducent().getModel() + ", "
                    + ((car.isAutomaticGear()) ? "skrzynia automatyczna" : "skrzynia manualna")
                    + ", segment " + car.getSegment()
                    + ", wymiary: wysokość " + car.getDimensions().getHigh() + "cm, szerokość " + car.getDimensions().getWidth() + "cm, pojemność baku " + car.getDimensions().getTrankCapacity() + " litrów."
                    + " Kraje sprzedaży: "
            );
            for (Country country : car.getCountriesOfSale()) {
                System.out.print(country.getCountryName() + " - " + country.getCountrySign() + ", ");
            }
        }
        System.out.println("\n");

    }

    public void printCountryNameFor(String producentName, boolean isAutomaticGear, int trankCapacity) {
        for (Car car : cars) {
            for (Country country : car.getCountriesOfSale()) {
                if (car.getProducent().getName().equals(producentName) && (car.getDimensions().getTrankCapacity() == trankCapacity) && (car.isAutomaticGear() == isAutomaticGear)) {
                    System.out.print(country.getCountryName() + " - " + country.getCountrySign() + ", ");
                }
            }
        }
    }
}