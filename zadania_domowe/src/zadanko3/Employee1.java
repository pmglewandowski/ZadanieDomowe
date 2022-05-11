package zadanko3;

public class Employee1 {

    public String name;
    public String lastname;
    public int age;

    public Employee1(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public Employee1(int age) {
        this.age = age;
    }


    public void printInfo() {
        System.out.println("Imię: " + name + " || Nazwisko: " + lastname + " || Wiek: " + age);
    }
}
