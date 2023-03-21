public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private String color;

    public Animal(String name, int age, boolean vaccinated, String color) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.color = color;
    }

    public void adopt() {
        System.out.println("I have been adopted");
    }

    public void feed() {
        System.out.println("I have been fed");
    }

    public void drink() {
        System.out.println("I have drank");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }
}
