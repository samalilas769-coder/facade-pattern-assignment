
public class Main {

    public static void main(String[] args) {

        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(
                        dvdPlayer,
                        projector,
                        soundSystem,
                        lights
                );

        try {
            homeTheater.watchMovie("Interstellar");
        } finally {
            homeTheater.endMovie();
        }
    }
}
