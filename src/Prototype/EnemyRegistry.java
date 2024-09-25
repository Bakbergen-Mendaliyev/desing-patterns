package Prototype;

import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {
    private Map<String, Enemy> enemies = new HashMap<>();

    public EnemyRegistry() {
        // Инициализируем прототипы
        enemies.put("goblin", new Goblin());
        enemies.put("orc", new Orc());
    }

    public Enemy createEnemy(String type) {
        return enemies.get(type).clone();
    }
}
