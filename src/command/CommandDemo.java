package command;

public class CommandDemo {

    public static void main(String[] args) {

        Light light = new Light();
        Door door = new Door();
        Thermostat thermostat = new Thermostat();

        Invoker remote = new Invoker();

        remote.executeCommand(new LightOnCommand(light));
        remote.executeCommand(new DoorOpenCommand(door));
        remote.executeCommand(new TempUpCommand(thermostat));

        remote.undo();
        remote.undo();
    }
}
