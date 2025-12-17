package ie.atu.inheritance;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        System.out.println("Dog name: " + dog.getName());
        System.out.println("Dog age: " + dog.getAge());
        System.out.println("Dog breed: " + dog.getBreed());
        dog.makeSound();
    }

}