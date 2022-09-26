package git7;

public class Horse extends Animal {
    boolean saddle;

    String name = "Лошадь";

    public Horse(String food, String location, boolean saddle) {
        super(food, location);
        this.saddle = saddle;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeNoise(Animal animal) {
        super.makeNoise(animal);
        System.out.println("Обычно очень тихое");
    }

    @Override
    public void Eat(Animal animal) {
        super.Eat(animal);
        System.out.println("Постоянно");
    }
}
