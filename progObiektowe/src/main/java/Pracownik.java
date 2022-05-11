public class Pracownik {

    String imie;
    String nazwisko;
    int wiek;

   void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + wiek + " lat.");
    }

    void wpiszImie(String name) {
        imie = name;
    }

   void wpiszNazwisko(String surname) {
        nazwisko = surname;
    }

    void wpiszWiek(int age) {
        wiek = age;
    }
    String dajImie(){
        return imie;
    }
   String dajNazwisko(){
        return nazwisko;
    }
    int dajWiek(){
        return wiek;
    }
}
