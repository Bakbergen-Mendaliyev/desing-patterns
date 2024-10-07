package StructuralPatterns.Adapter;

/**
 * Интерфейс MediaPlayer для воспроизведения аудиофайлов.
 * Поддерживает базовые форматы (например, MP3).
 */
public interface MediaPlayer {
    void play(String fileName);
}


