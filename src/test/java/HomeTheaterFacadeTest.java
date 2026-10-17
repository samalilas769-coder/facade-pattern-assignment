
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HomeTheaterFacadeTest {

    private HomeTheaterFacade createHomeTheater() {
        return new HomeTheaterFacade(
                new DVDPlayer(),
                new Projector(),
                new SoundSystem(),
                new Lights()
        );
    }

    @Test
    void shouldStartMovieSuccessfully() {
        HomeTheaterFacade theater = createHomeTheater();

        assertDoesNotThrow(
                () -> theater.watchMovie("Interstellar")
        );
    }

    @Test
    void shouldRejectEmptyMovieTitle() {
        HomeTheaterFacade theater = createHomeTheater();

        assertThrows(
                IllegalArgumentException.class,
                () -> theater.watchMovie("")
        );
    }

    @Test
    void shouldRejectNullMovieTitle() {
        HomeTheaterFacade theater = createHomeTheater();

        assertThrows(
                IllegalArgumentException.class,
                () -> theater.watchMovie(null)
        );
    }

    @Test
    void shouldRejectNullSubsystem() {
        assertThrows(
                NullPointerException.class,
                () -> new HomeTheaterFacade(
                        null,
                        new Projector(),
                        new SoundSystem(),
                        new Lights()
                )
        );
    }

    @Test
    void shouldRejectInvalidVolume() {
        SoundSystem soundSystem = new SoundSystem();
        soundSystem.turnOn();

        assertThrows(
                IllegalArgumentException.class,
                () -> soundSystem.setVolume(150)
        );
    }

    @Test
    void shouldEndMovieSuccessfully() {
        HomeTheaterFacade theater = createHomeTheater();

        theater.watchMovie("Interstellar");

        assertDoesNotThrow(theater::endMovie);
    }
}
