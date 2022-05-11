import java.util.ArrayList;
import java.util.List;

public class Main {


    public static  void main(String[] args) {




        Country niemcy = new Country("Germany",'D');
        Country wlochy = new Country("Italy",'I');
        Country anglia = new Country("England",'E');
        Country chiny = new Country("China",'C');
        Country usa = new Country("USA",'U');
        Country japonia = new Country("Japan",'J');
        Country korea = new Country("Korea",'K');
        Country indie = new Country("India",'Y');
        Country francja = new Country("France",'F');
        Country polska = new Country("Poland",'P');
        Country holandia = new Country("Netherlands",'N');
        Country slowacja = new Country("Slovakia",'S');
        Country rosja = new Country("Russia",'R');
        Country ukraina = new Country("Ukraine",'U');
        Country austria = new Country("Austria",'A');

        Producent audi = new Producent ("Audi","A8");
        Producent alfaRomeo = new Producent ("Alfa Romeo","Giulia");
        Producent astonMartin = new Producent ("Aston Martin","DB9");
        Producent bmw = new Producent ("BMW","M5");
        Producent ford = new Producent ("Ford","Mustang");
        Producent volvo = new Producent ("Volvo","X60");
        Producent honda = new Producent ("Honda","Prelude");
        Producent hyundai = new Producent ("Hyundai","i70");
        Producent renault = new Producent ("Renault","Megane");
        Producent suzuki = new Producent ("Suzuki","Vitara");

        Dimensions duzy = new Dimensions(170,250,1000);
        Dimensions sredni = new Dimensions(150,200,600);
        Dimensions maly = new Dimensions(120,180,350);

        List<Country> lista1 = new ArrayList<>();
        lista1.add(niemcy);
        lista1.add(wlochy);
        lista1.add(anglia);
        lista1.add(francja);
        lista1.add(ukraina);

        List<Country> lista2 = new ArrayList<>();
        lista2.add(austria);
        lista2.add(rosja);
        lista2.add(anglia);
        lista2.add(francja);
        lista2.add(slowacja);

        List<Country> lista3 = new ArrayList<>();
        lista3.add(holandia);
        lista3.add(wlochy);
        lista3.add(indie);
        lista3.add(polska);
        lista3.add(niemcy);

        List<Country> lista4 = new ArrayList<>();
        lista4.add(chiny);
        lista4.add(usa);
        lista4.add(japonia);
        lista4.add(francja);
        lista4.add(niemcy);

        List<Country> lista5 = new ArrayList<>();
        lista5.add(korea);
        lista5.add(chiny);
        lista5.add(indie);
        lista5.add(francja);
        lista5.add(ukraina);


        Car samochódDziadka= new Car(audi, false, "premium", duzy,lista1 );
        Car samochódBabci= new Car(alfaRomeo, true, "premium", maly,lista2 );
        Car samochódMamy= new Car(astonMartin, true, "premium", maly,lista3 );
        Car samochódTaty= new Car(bmw, false, "medium", duzy,lista4 );
        Car samochódBrata= new Car(ford, true, "medium", sredni,lista5 );
        Car samochódSiostry= new Car(volvo, true, "premium", duzy,lista1 );
        Car samochódWujka= new Car(honda, false, "medium", sredni,lista2 );
        Car samochódCioci= new Car(hyundai, true, "standard", sredni,lista3 );
        Car samochódSasiada= new Car(renault, false, "standard", duzy,lista4 );
        Car samochódDziecka= new Car(suzuki, false, "standard", maly,lista5 );

        Factory factory = new Factory();
        factory.addCar(samochódDziadka);
        factory.addCar(samochódBabci);
        factory.addCar(samochódMamy);
        factory.addCar(samochódTaty);
        factory.addCar(samochódBrata);
        factory.addCar(samochódSiostry);
        factory.addCar(samochódWujka);
        factory.addCar(samochódCioci);
        factory.addCar(samochódSasiada);
        factory.addCar(samochódDziecka);


        factory.printAllData();
        factory.printCountryNameFor("Audi",false,1000);

    }
}
