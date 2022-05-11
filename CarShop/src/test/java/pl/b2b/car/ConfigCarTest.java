package pl.b2b.car;


import org.junit.Before;
import org.junit.Test;
import pl.b2b.cnf.DataCar;

import static org.junit.Assert.assertEquals;

public class ConfigCarTest {
    private Car car1;
    private Car car2;
    private Car car3;
    private Car car4;
    private Car car5;
    private Car car6;
    private Car car7;
    private Car car8;

    DataCar dataCar;
    ConfigCar configCar;

    @Before
    public void setUp(){
        dataCar = new DataCar();
        configCar = new ConfigCar();
        car1 = dataCar.getMazda();
        car2 = dataCar.getSubaru();
        car3 = dataCar.getCitroen();
        car4 = dataCar.getFiat();
        car5 = dataCar.getRenault();
        car6 = dataCar.getSkoda();
        car7 = dataCar.getVolkswagen();
        car8 = dataCar.getVolvo();
    }

    @Test
    public void nameAndPower(){
        assertEquals("Mazda 165",configCar.nameAndPower(car1));
        assertEquals("Subaru 300", configCar.nameAndPower(car2));
        assertEquals("Fiat 120", configCar.nameAndPower(car4));
    }

    @Test
    public void fuelCountOnXkm(){
        assertEquals(22.4,configCar.fuelCountOnXkm(car1,200),0.01);
        assertEquals(21,configCar.fuelCountOnXkm(car2,200),0.01);
    }

    @Test
    public void rangeOnMaxFuel(){
        assertEquals(523.8095238095239,configCar.rangeOnMaxFuel(car8),0.01);
        assertEquals(306.6666666666667,configCar.rangeOnMaxFuel(car7),0.01);
    }

    @Test
    public void priceOfFuelUsedOnXkm(){
        assertEquals(131.0,configCar.priceOfFuelUsedOnXkm(car6,200,5.00),0.01);
        assertEquals(101.775,configCar.priceOfFuelUsedOnXkm(car5,300,2.95),0.01);
    }

    @Test
    public void howFastOnTopSpeedOnXkm(){
        assertEquals(5.555555555555555,configCar.howFastOnTopSpeedOnXkm(car4,1000.0),0.01);
        assertEquals(5.128205128205129,configCar.howFastOnTopSpeedOnXkm(car3,1000.0),0.01);
    }

    @Test
    public void coompareTwoCarsAndChooseCarWithHigerMaxRange(){
        assertEquals("Fiat",configCar.coompareTwoCarsAndChooseCarWithHigherMaxRange(car4,car3));
        assertEquals("Volvo",configCar.coompareTwoCarsAndChooseCarWithHigherMaxRange(car1,car8));
    }


}
