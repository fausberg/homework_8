package git7;

public class Cat extends Animal {
    boolean calmness;

    String name = "Кошка";

    public Cat(String food, String location, boolean calmness) {
        super(food, location);
        this.calmness = calmness;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeNoise(Animal animal) {
        super.makeNoise(animal);
        System.out.println("Никогда не шумит");
    }

    @Override
    public void Eat(Animal animal) {
        super.Eat(animal);
        System.out.println("Только когда проснётся");
    }
}
