package StructuralPatterns.Adapter;

/**
 * Интерфейс AdvancedMediaPlayer для воспроизведения более сложных аудио форматов,
 * таких как VLC и MP4.
 */
public interface AdvancedMediaPlayer {
    void playAdvanced(String fileName);
}

