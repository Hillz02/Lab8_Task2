class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];

        animal[0] = new Falcon("Brown", "Falcon", "Falcon", "1 year", "5.5kg");
        animal[1] = new Dog("German Sheperd", "Dog", "4", "Ricky", "3 years", "8kg");
        animal[2] = new Tuna("No", "Mr.Fish", "2 years", "500g");

    }
}



interface AnimalBehavior {
    void Sleep();
}

interface AnimalMove {
    default void Move() {
    }
}

interface AnimalName {
    public static void animalName(String name) {
        System.out.println(name);
    }
}

abstract class Animal implements AnimalBehavior, AnimalMove, AnimalName {
    public static String[] name = new String[3],
            age = new String[3], weightFields = new String[3];

    public static void Eat() {
        System.out.println("Eating: Nom Nom Nom!");
    }

    public abstract void Voice();
}

class Bird extends Animal {
    private String featherColour, breed;

    Bird(String featherColour, String breed) {
        this.featherColour = featherColour;
        this.breed = breed;
    }

    Bird() {
        super();
    }

    public String getFeatherColour() {
        return this.featherColour;
    }

    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Voice: Jib Jib Jib!");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleeping: zzzzzz");
    }
}

class Dog extends Mammal {
    public static String Breed, Species, Legs;
    Mammal mam = new Mammal();

    Dog(String breed, String species, String legs, String name, String age, String weight) {
        super(breed, species, legs);
        Breed = breed;
        Species = species;
        Legs = legs;
        Animal.name[0] = name;
        Animal.age[0] = age;
        Animal.weightFields[0] = weight;

        System.out.println(String.format("Dog || Name: %s, Age: %s, Weight: %s, " +
                        "Breed: %s, Species: %s, Legs: %s", Animal.name[0],
                Animal.age[0], Animal.weightFields[0],
                Breed, Species, Legs));
        Animal.Eat();
        mam.Sleep();
        mam.Voice();
        Move();
        System.out.println("");
    }

    @Override
    public void Move() {
        System.out.println("Move: Dogs will walk.");
    }
}

class Falcon extends Bird {
    public static String FeatherColour, Breed;
    Bird bird = new Bird();

    Falcon(String featherColour, String breed, String name, String age, String weight) {
        super(featherColour, breed);
        FeatherColour = featherColour;
        Breed = breed;
        Animal.name[1] = name;
        Animal.age[1] = age;
        Animal.weightFields[1] = weight;

        System.out.println(String.format("Falcon || Name: %s, Age: %s, Weight: %s, " +
                        "Feather Colour: %s, Breed: %s", Animal.name[1], Animal.age[1],
                Animal.weightFields[1],
                FeatherColour, Breed));
        Animal.Eat();
        bird.Sleep();
        bird.Voice();
        Move();
        System.out.println("");
    }

    @Override
    public void Move() {
        System.out.println("Move: Falcon will fly.");
    }
}

class Fish extends Animal {
    private String oxygen;

    Fish(String oxygen) {
        this.oxygen = oxygen;
    }

    Fish() {

    }

    public String getOxygen() {
        return this.oxygen;
    }

    public void setOxygen(String oxygen) {
        this.oxygen = oxygen;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Voice: Bladder Bladder!");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleeping: zzzzzz");
    }
}

class Tuna extends Fish {
    public static String Oxygen;
    Fish fish = new Fish();

    Tuna(String oxygen, String name, String age, String weight) {
        super(oxygen);
        Oxygen = oxygen;
        Animal.name[2] = name;
        Animal.age[2] = age;
        Animal.weightFields[2] = weight;

        System.out.println(String.format("Tuna || Name: %s, Age: %s," +
                        "Weight: %s, Oxygen: %s",
                Animal.name[2], Animal.age[2], Animal.weightFields[2], Oxygen));
        Animal.Eat();
        fish.Sleep();
        fish.Voice();
        Move();
        System.out.println("");
    }

    @Override
    public void Move() {
        System.out.println("Move: Tuna will swim.");
    }
}

public class Mammal extends Animal {
    private String breed, species, legs;

    Mammal(String breed, String species, String legs) {
        this.breed = breed;
        this.species = species;
        this.legs = legs;
    }

    public Mammal() {

    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getLegs() {
        return this.legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Voice: Bark Bark!!");
    }

    @Override
    public void Sleep() {

    }
}
