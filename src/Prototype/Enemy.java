package Prototype;

public abstract class Enemy implements Cloneable {
    private String type;

    public Enemy(String type) {
        this.type = type;
    }

    public void attack() {
        System.out.println(type + " атакует!");
    }

    @Override
    public Enemy clone() {
        Enemy clone = null;
        try {
            clone = (Enemy) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
