
import java.util.Objects;

public class HomeTheaterFacade {

    private final DVDPlayer dvdPlayer;
    private final Projector projector;
    private final SoundSystem soundSystem;
    private final Lights lights;

    public HomeTheaterFacade(
            DVDPlayer dvdPlayer,
            Projector projector,
            SoundSystem soundSystem,
            Lights lights) {

        this.dvdPlayer = Objects.requireNonNull(dvdPlayer);
        this.projector = Objects.requireNonNull(projector);
        this.soundSystem = Objects.requireNonNull(soundSystem);
        this.lights = Objects.requireNonNull(lights);
    }

    public void watchMovie(String movie) {
        if (movie == null || movie.isBlank()) {
            throw new IllegalArgumentException(
                    "Movie title cannot be empty");
        }

        System.out.println("Preparing Home Theater...");

        try {
            lights.dim(20);
            projector.turnOn();
            projector.setInput("DVD Player");
            soundSystem.turnOn();
            soundSystem.setVolume(50);
            dvdPlayer.turnOn();
            dvdPlayer.playMovie(movie);

            System.out.println("Enjoy your movie!");
        } catch (RuntimeException exception) {
            endMovie();
            throw new IllegalStateException(
                    "Home Theater setup failed", exception);
        }
    }

    public void endMovie() {
        System.out.println("Shutting down Home Theater...");

        dvdPlayer.stop();
        dvdPlayer.turnOff();
        soundSystem.turnOff();
        projector.turnOff();
        lights.turnOn();

        System.out.println("Home Theater is OFF");
    }
}
