package StructuralPatterns.Adapter;

/**
 * Класс VlcPlayer реализует AdvancedMediaPlayer для воспроизведения VLC-файлов.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playAdvanced(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
}

