import creatingclasses.Animal;
import creatingclasses.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Nimrod", 42);
        System.out.println(person1);
        Animal animal1= new Animal(21, "Cat");
        System.out.println(animal1);

    }
}