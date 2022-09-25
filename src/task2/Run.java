package task2;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        Random random = new Random();
        Doctor therapist = new Therapist();
        Doctor dentist = new Dentist();
        Doctor surgeon = new Surgeon();

        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();

        TreatmentPlan treatmentPlan1 = new TreatmentPlan(1);
        TreatmentPlan treatmentPlan2 = new TreatmentPlan(2);
        TreatmentPlan treatmentPlan3 = new TreatmentPlan(3);

        patient1.setTreatmentPlan(treatmentPlan1);
        patient2.setTreatmentPlan(treatmentPlan2);
        patient3.setTreatmentPlan(treatmentPlan3);

        treatmentPlan(patient1.getTreatmentPlan().getCode());
        treatmentPlan(patient2.getTreatmentPlan().getCode());
        treatmentPlan(patient3.getTreatmentPlan().getCode());

    }



    public static void treatmentPlan(int code) {
        switch (code) {
            case (1):
                Doctor surgeon = new Surgeon();
                surgeon.treat();
                break;
            case (2):
                Doctor dentist = new Dentist();
                dentist.treat();
                break;
            default:
                Doctor therapist = new Therapist();
                therapist.treat();
                break;
        }
    }
}
