public class Country {
    public String getCountryName() {
        return countryName;
    }

    public char getCountrySign() {
        return countrySign;
    }

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    private String countryName;
    private char countrySign;




}
