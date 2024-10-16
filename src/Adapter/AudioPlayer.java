package Adapter;

public class AudioPlayer implements  MediaPlayer{
    private MediaAdapter mediaAdapter;
    // Concrete Class: AudioPlayer
    @Override
    public void play(String audioType, String fileName) {
        // Inbuilt support for MP3
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        }
        // MediaAdapter is used to play other formats
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media type: " + audioType + " format not supported");
        }
    }
}
