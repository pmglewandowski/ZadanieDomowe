public class Firma {

    public static void main (String[] args) {

        Pracownik pracownik1 = new Pracownik();
        pracownik1.wpiszImie("Jan");
        pracownik1.wpiszNazwisko("Maklakiewicz");
        pracownik1.wpiszWiek(56);

        Pracownik pracownik2 = new Pracownik();
        pracownik2.wpiszImie("Henryk");
        pracownik2.wpiszNazwisko("Surzyński");
        pracownik2.wpiszWiek(68);

        Pracownik pracownik3 = new Pracownik();
        pracownik3.wpiszImie("Gerwazy");
        pracownik3.wpiszNazwisko("Gorczycki");
        pracownik3.wpiszWiek(89);


        pracownik1.przedstawSie();
        pracownik2.przedstawSie();
        pracownik3.przedstawSie();
    }




//    public static void main (String[] args){
//        Pracownik[] pracownicy = new Pracownik[3];
//
//        String[] imiona = {"Jan", "Henryk" , "Gerwazy"};
//       String[] nazwiska = {"Maklakiewicz", "Surzyński", "Gorczycki"};
//        int[] wiek = {56,68,89};
//
//        for (int i=0; i<pracownicy.length; i++) {
//           pracownicy[i] = new Pracownik();
//            pracownicy[i].imie = imiona[i];
//            pracownicy[i].nazwisko = nazwiska[i];
//            pracownicy[i].wiek = wiek[i];
//        }
//        System.out.println("Pracownicy firmy to:");
//        for(int i = 0; i<pracownicy.length; i++){
//            System.out.println(pracownicy[i].imie + " " + pracownicy[i].nazwisko + " " +  pracownicy[i].wiek + " lat" );
//        }
//
//    }
}
