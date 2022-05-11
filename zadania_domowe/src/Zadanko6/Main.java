package Zadanko6;

public class Main {
    public static void main(String[] args) {
        City london = new City("London", 123450);
        Address park = new Address("Parkowa", 22, 5, london);
        Person adam = new Person("Adam", "Nowak", park);

        City warsaw = new City("Warsaw", 98765);
        Address zlota = new Address("Złota", 33, 1, warsaw);
        Person jan = new Person("Jan", "Kowalski", zlota);


        Letter letter = new Letter(adam, jan, "List polecony");

        System.out.println("List: ");
        System.out.println(letter.getSenderData());
        System.out.println(letter.getRecipientData());
        System.out.println(letter.getContentData());
    }
}
