package task2;

public class Dentist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Ваш врач дантист и будет лечить как знает");
    }
}
