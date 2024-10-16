package Facade;

public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private TheaterLights lights;
    private SurroundSoundSystem soundSystem;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, TheaterLights lights, SurroundSoundSystem soundSystem){
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.setWideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        lights.dim(100);
        projector.off();
        soundSystem.off();
        dvdPlayer.stop();
        dvdPlayer.off();
    }
}
