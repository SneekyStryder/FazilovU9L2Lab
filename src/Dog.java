public class Dog extends Animal {
    private boolean hasBeenWalked;
    private boolean hasBarked;

    public Dog(String name, int age, boolean vaccinated, String color) {
        super(name, age, vaccinated, color);
        hasBeenWalked = false;
        hasBarked = false;
    }

    public void walk() {
        hasBeenWalked = true;
        System.out.println("I have been walked");
    }

    public void bark() {
        hasBarked = true;
        System.out.println("Bark!");
    }

    public boolean isHasBeenWalked() {
        return hasBeenWalked;
    }

    public boolean isHasBarked() {
        return hasBarked;
    }
}
