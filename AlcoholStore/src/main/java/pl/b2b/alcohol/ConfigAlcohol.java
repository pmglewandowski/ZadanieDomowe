package pl.b2b.alcohol;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ConfigAlcohol {

    public String expensiveAlcohol(List<Alcohol> alcohols) {

        Alcohol wynik = alcohols.get(0);
        for (Alcohol alcohol : alcohols) {
            if (alcohol.getPrice() > wynik.getPrice()) {
                wynik = alcohol;
            }


        }
        return wynik.getName();
    }

    public String cheapAlcohol(List<Alcohol> alcohols) {

        Alcohol min = alcohols.get(0);
        for (Alcohol alcohol : alcohols) {
            if (alcohol.getPrice() < min.getPrice()) {
                min = alcohol;
            }


        }
        return min.getName();
    }


    public double averagePrice(List<Alcohol> alcohols) {
        double suma = 0;
        double srednia = 0;

        for (Alcohol alcohol : alcohols) {
            suma = suma + alcohol.getPrice();
            srednia = suma / alcohols.size();


        }


        return srednia;

    }


    public List<String> namesOfAlcoholsWitchPriceIsHigherThanAverage(List<Alcohol> alcohols) {

        List<String> lista = new ArrayList<>();

        ConfigAlcohol srednia = new ConfigAlcohol();


        for (Alcohol alcohol : alcohols) {
            if (alcohol.getPrice() > srednia.averagePrice(alcohols)) ;
            {

                lista.add(alcohol.getName());
            }
        }

        return lista;

    }


    public String nameAndPrice(Alcohol alcohol) {
        String imie = alcohol.getName();
        double cena = alcohol.getPrice();

        return imie + " " + cena;
    }


























   public List<String> nameAndPriceBelowAveragePrice(List<Alcohol> alcohols) {

       List<String> lista = new ArrayList<>();

       ConfigAlcohol srednia = new ConfigAlcohol();

       ConfigAlcohol napri = new ConfigAlcohol();


       for (Alcohol alcohol : alcohols) {
           if (alcohol.getPrice() < srednia.averagePrice(alcohols)) ;
           {

               lista.add(napri.nameAndPrice(alcohol));
           }
       }

       return lista;
   }
}





