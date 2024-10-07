package StructuralPatterns.Adapter;

/**
 * Класс Mp4Player реализует AdvancedMediaPlayer для воспроизведения MP4-файлов.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playAdvanced(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}

