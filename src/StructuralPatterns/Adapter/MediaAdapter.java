package StructuralPatterns.Adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс MediaAdapter действует как мост между интерфейсами MediaPlayer и AdvancedMediaPlayer.
 * Он преобразует запросы от MediaPlayer к соответствующим методам AdvancedMediaPlayer.
 */
public class MediaAdapter implements MediaPlayer {
    // Карта, которая сопоставляет аудиоформаты с их соответствующими проигрывателями.
    private static Map<String, AdvancedMediaPlayer> playerMap = new HashMap<>();

    // Регистрация всех возможных проигрывателей в статическом блоке.
    static {
        playerMap.put("vlc", new VlcPlayer());
        playerMap.put("mp4", new Mp4Player());
    }

    private AdvancedMediaPlayer advancedMusicPlayer;

    /**
     * Конструктор MediaAdapter ищет нужный проигрыватель по типу аудиофайла.
     * @param audioType - тип аудиофайла (например, vlc, mp4).
     */
    public MediaAdapter(String audioType) {
        this.advancedMusicPlayer = playerMap.get(audioType.toLowerCase());
    }

    /**
     * Метод play вызывает соответствующий метод воспроизведения у адаптированного проигрывателя.
     * @param fileName - имя файла для воспроизведения.
     */
    @Override
    public void play(String fileName) {
        if (advancedMusicPlayer != null) {
            advancedMusicPlayer.playAdvanced(fileName);  // Воспроизводит файл через AdvancedMediaPlayer.
        } else {
            System.out.println("Unsupported audio format");
        }
    }
}

