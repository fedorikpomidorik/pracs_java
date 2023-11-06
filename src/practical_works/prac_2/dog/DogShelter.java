package practical_works.prac_2.dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogShelter {
    private final List<Dog> dogs;

    public DogShelter() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> getAllDogs() {
        return dogs;
    }

    public static void main(String[] args) {
        DogShelter shelter = new DogShelter();

        Dog dog1 = new Dog("Rex", 12);

        shelter.addDog(dog1);

        Dog dog2 = new Dog("Bella", 7);

        shelter.addDog(dog2);

        System.out.println("Input Dog's name:");
        Scanner in1 = new Scanner(System.in);
        String name = in1.nextLine();

        System.out.println("Input dog's age:");
        Scanner in2 = new Scanner(System.in);
        int age = in2.nextInt();
        Dog dog3 = new Dog(name, age);
        shelter.addDog(dog3);

        List<Dog> dogs = shelter.getAllDogs();
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
            System.out.println("Human age: " + dog.humanAge() + " years");
        }
    }
}