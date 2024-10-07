package StructuralPatterns.Adapter;

/**
 * Класс AudioPlayer поддерживает базовый формат (MP3) и использует MediaAdapter
 * для воспроизведения других форматов (VLC, MP4).
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    /**
     * Метод play обрабатывает mp3 напрямую, а для других форматов использует адаптер.
     * @param fileName - имя файла для воспроизведения.
     */
    @Override
    public void play(String fileName) {
        // Определение расширения файла для определения его формата
        String audioType = getFileExtension(fileName);

        if ("mp3".equalsIgnoreCase(audioType)) {
            // Воспроизведение MP3 напрямую
            System.out.println("Playing mp3 file: " + fileName);
        } else {
            // Использование адаптера для других форматов
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(fileName);
        }
    }

    /**
     * Метод для получения расширения файла (например, mp3, vlc, mp4).
     * @param fileName - имя файла.
     * @return расширение файла.
     */
    private String getFileExtension(String fileName) {
        int i = fileName.lastIndexOf('.');
        if (i > 0) {
            return fileName.substring(i + 1);
        }
        return "";
    }
}

