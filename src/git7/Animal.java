package git7;

public class Animal {
    String food;
    String location;

    String name;

    public String getName() {
        return name;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(Animal animal){
        System.out.println(animal + " Шумит");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void Eat(Animal animal){
        System.out.println(animal + " Ест");
    }

    public void Sleep(Animal animal){
        System.out.println(animal + " Спит");
    }
}
