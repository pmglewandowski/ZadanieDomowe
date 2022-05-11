package zadanko3;


public class Company1 {
    public static void main(String[] args) {
        Employee1 employee1 = new Employee1("Jan", "Janowy", 30);
        Employee1 employee2 = new Employee1("Tomasz", "Tomaszowy", 40);
        Employee1 employee3 = new Employee1("Marcin", "Marcinowy", 50);

        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();

        employee1.age = 1900;
        employee1.printInfo();

        Employee1 employee4 = new Employee1(30);
        employee4.printInfo();
    }
}
