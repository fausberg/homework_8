package task1;

import java.util.Arrays;

public class Phone {
    private int number;
    private String model;
    private double weight;

    Phone(){}

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }
    public void receiveCall(String name, int number) {
        receiveCall(name);
        System.out.println( "with phone number " + number);
    }

    public void sendMassage(int ...numbers){
        System.out.println("task1.Phone number " + Arrays.toString(numbers));
    }


}
