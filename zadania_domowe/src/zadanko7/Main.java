package zadanko7;


public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Azor", 60);
        dog.bark();
        dog.introduce();
        dog.eat();
        System.out.print("\n");
        Bird bird = new Bird("Tweety", 10, true);
        bird.eat();
        bird.introduce();
        bird.fly();
        System.out.print("\n");
        Eagle eagle = new Eagle("Bonzo", 200, 10);
        eagle.eat();
        eagle.introduce();
        eagle.fly();
        System.out.println("I have claws length: " + eagle.clawsLength);
        System.out.print("\n");
        Penguin penguin = new Penguin("Maniek", 50, 60);
        penguin.eat();
        penguin.introduce();
        penguin.fly();
        System.out.println("My swimming speed: " + penguin.swimmingSpeed);
    }
}