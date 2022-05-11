package Composers.composer;

public class Composer {

    private String bestfilm;
    private String name;
    private String surname;
    private int age;
    private double rating;
    private int rank;

    public Composer(String name, String surname, int age, int rank, double rating, String bestfilm) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.rank = rank;
        this.rating = rating;
        this.bestfilm = bestfilm;
    }

    public String getName() { return name;}
    public String getSurname() {return surname;}
    public int getAge() {return age;}
    public int getRank() {return rank;}
    public double getRating() {return rating;}
    public String getBestfilm() {return bestfilm;}


}
