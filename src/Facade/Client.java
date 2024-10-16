package Facade;

public class Client {
    public static void main(String[] args) {
        // Create subsystem components
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        SurroundSoundSystem soundSystem = new SurroundSoundSystem();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, lights, soundSystem);

        // Use the simplified interface to watch a movie
        homeTheater.watchMovie("Inception");

        // End the movie
        homeTheater.endMovie();
    }
}
