package task2;

public class Surgeon implements Doctor {
    @Override
    public void treat() {
        System.out.println("Ваш врач хирург и будет лечить как знает");
    }
}
