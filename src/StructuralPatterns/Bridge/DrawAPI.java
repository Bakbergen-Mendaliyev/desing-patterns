package StructuralPatterns.Bridge;

/**
 * Интерфейс для реализации отрисовки.
 * Служит мостом между абстракцией и конкретной реализацией.
 */
public interface DrawAPI {
    void drawCircle(int radius, int x, int y);
}

