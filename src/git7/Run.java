package git7;

public class Run {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        Veterinarian veterinarian = new Veterinarian();

        animals[0] = new Dog("Собачий корм", "Везде", true,false);
        animals[1] = new Dog("Собачий корм", "Везде", false,true);
        animals[2] = new Cat("Кошачий корм", "Там где хорошо", true);
        animals[3] = new Cat("Кошачий корм", "Там где хорошо", false);
        animals[4] = new Horse("Сено", "В поле", true);

        for(int i = 0; i < 5; i++){
            veterinarian.treatAnimal(animals[i]);
        }

    }
}
