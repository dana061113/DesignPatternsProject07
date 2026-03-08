package templatemethod;

public class HotChocolate extends Beverage {

    void brew() {
        System.out.println("Mixing chocolate powder");
    }

    void addCondiments() {
        System.out.println("Adding marshmallows");
    }
}
