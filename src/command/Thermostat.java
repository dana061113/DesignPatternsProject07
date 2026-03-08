package command;

public class Thermostat {

    private int temperature = 20;

    public void increase() {
        temperature++;
        System.out.println("Temperature increased to " + temperature);
    }

    public void decrease() {
        temperature--;
        System.out.println("Temperature decreased to " + temperature);
    }
}
