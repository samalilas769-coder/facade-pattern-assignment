
public class Projector {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Projector is ON");
    }

    public void setInput(String input) {
        if (!isOn) {
            throw new IllegalStateException(
                    "Cannot set input: Projector is OFF"
            );
        }

        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(
                    "Projector input cannot be empty"
            );
        }

        System.out.println("Projector input: " + input);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Projector is OFF");
    }
}
