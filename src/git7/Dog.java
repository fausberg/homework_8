package git7;

public class Dog extends Animal {
    boolean training;
    boolean hanting;

    String name = "Собака";

    public Dog(String food, String location, boolean training, boolean hanting) {
        super(food, location);
        this.training = training;
        this.hanting = hanting;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeNoise(Animal animal) {
        super.makeNoise(animal);
        System.out.println("Но может шуметь");
    }

    @Override
    public void Eat(Animal animal) {
        super.Eat(animal);
        System.out.println("Но очень редко");
    }
}
