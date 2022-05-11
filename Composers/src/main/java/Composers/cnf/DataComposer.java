package Composers.cnf;

import Composers.composer.Composer;

import java.util.ArrayList;
import java.util.List;

public class DataComposer {
        private List<Composer> composers;

    Composer hans;
    Composer thomas;
    Composer john;
    Composer ennio;
    Composer james;
    Composer nino;
    Composer jerry;
    Composer howard;
    Composer alan;

    public DataComposer() {
        hans = new Composer("Hans", "Zimmer", 61, 10, 8.62, "Gladaitor");
        thomas = new Composer("Thomas", "Newman", 63,29,8.11,"Shawshank redemption");
        john = new Composer("John", "Williams", 86, 4, 8.83,"Star Wars");
        ennio = new Composer("Ennio", "Morricone", 90, 2, 8.96, "Good, Bad and Ugly");
        james = new Composer("James", "Horner", 61,23,8.22,"Bravehearth");
        nino = new Composer("Nino", "Rota", 67, 1, 9.05, "Godfather");
        jerry = new Composer("Jerry", "Goldsmith",75,36,7.98,"Omen");
        howard = new Composer("Howard", "Shore", 72, 9, 8.63,"Lord of the Rings");
        alan = new Composer("Alan", "Menken", 69,18, 8.41, "Aladdin");

        composers = new ArrayList<>();
        composers.add(hans);
        composers.add(thomas);
        composers.add(john);
        composers.add(ennio);
        composers.add(james);
        composers.add(nino);
        composers.add(jerry);
        composers.add(howard);
        composers.add(alan);
}
    public List<Composer> getComposers() {return composers;}
}
