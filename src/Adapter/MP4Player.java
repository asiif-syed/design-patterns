package Adapter;
// Concrete Adaptee: MP4 Player
public class MP4Player implements  AdvancedMediaPlayer{
    public void playVLC(String fileName) {
        // Do nothing
    }

    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}
