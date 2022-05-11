package Composers.composer;

import Composers.cnf.DataComposer;

import java.util.List;

public class ConfigComposer {


    public String nameAndAge(Composer composer) {

        return composer.getName() + " " + composer.getAge();
    }

    public String nameAndAgeHigherThanMenken(Composer composer, Composer alan) {

        ConfigComposer composers = new ConfigComposer();
        if (composer.getAge() > alan.getAge()) {
            return composers.nameAndAge(composer);
        }
        else return null;
    }

    public double averageAge(List<Composer> composers) {
        int suma = 0;
        double srednia = 0;

        for (Composer composer : composers) {
            suma = suma + composer.getAge();
            srednia = suma / composers.size();
        }
        return srednia;
    }

    public String maxRating(List<Composer> composers) {

        Composer max = composers.get(0);
        for (Composer composer : composers) {
            if (composer.getRating() > max.getRating()) {
                max = composer;
            }
        }
        return max.getName();
    }

}










