package task2;

public class Therapist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Ваш врач терапевт и будет лечить как знает");
    }
}
