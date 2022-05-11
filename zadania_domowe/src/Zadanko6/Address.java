package Zadanko6;

public class Address {
    private String street;
    private int streetNumber;
    private int houseNumber;
    private City city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Address(String street, int streetNumber, int houseNumber, City city) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
        this.city = city;
    }

    public String getData() {
        return "Address: " + street + " " + streetNumber + " " + houseNumber + " " + city.getData();
    }
}
