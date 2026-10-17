
public class DVDPlayer {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("DVD Player is ON");
    }

    public void playMovie(String movie) {
        if (!isOn) {
            throw new IllegalStateException(
                    "Cannot play movie: DVD Player is OFF"
            );
        }
        if (movie == null || movie.isBlank()) {
            throw new IllegalArgumentException(
                    "Movie title cannot be empty"
            );
        }
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        if (isOn) {
            System.out.println("DVD Player stopped");
        }
    }

    public void turnOff() {
        isOn = false;
        System.out.println("DVD Player is OFF");
    }
}
