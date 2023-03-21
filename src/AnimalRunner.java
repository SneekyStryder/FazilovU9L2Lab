public class AnimalRunner {
    public static void main(String[] args) {
        Animal someAnimal = new Animal("NoName", 17, true, "Blue");
        System.out.println(someAnimal.getAge());
        System.out.println(someAnimal.getColor());
        System.out.println(someAnimal.getName());
        System.out.println(someAnimal.isVaccinated());
        someAnimal.adopt();
        someAnimal.drink();
        someAnimal.feed();

        Dog dog = new Dog("Wooley", 4, true, "Grey");
        System.out.println(dog.getAge());
        System.out.println(dog.getColor());
        System.out.println(dog.getName());
        System.out.println(dog.isVaccinated());
        dog.bark();
        dog.walk();
        System.out.println(dog.isHasBarked());
        System.out.println(dog.isHasBeenWalked());

        Cat cat = new Cat("Cub", 1, true, "Brown");
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());
        System.out.println(cat.getName());
        System.out.println(cat.isVaccinated());
        cat.play();
        cat.purr();
        System.out.println(cat.isHasPlayedWith());
        System.out.println(cat.isHasPurred());
    }
}
