public class Cat extends Animal {
    private boolean hasPlayedWith;
    private boolean hasPurred;

    public Cat(String name, int age, boolean vaccinated, String color) {
        super(name, age, vaccinated, color);
        hasPlayedWith = false;
        hasPurred = false;
    }

    public void play() {
        hasPlayedWith = true;
        System.out.println("I have played");
    }

    public void purr() {
        hasPurred = true;
        System.out.println("Purrrr");
    }

    public boolean isHasPlayedWith() {
        return hasPlayedWith;
    }

    public boolean isHasPurred() {
        return hasPurred;
    }
}
