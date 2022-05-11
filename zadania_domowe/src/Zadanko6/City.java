package Zadanko6;

public class City {
    private String name;
    private int zipcode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZipcode() {
        if (zipcode > 100000) {
            System.out.println("Podałeś zły zipCode");
        }
        return zipcode;
    }


    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public City(String name, int set) {
        this.name = name;
        this.zipcode = zipcode;
    }

    public String getData() {
        return "City: " + name + " " + zipcode;
    }
}
