package Assignment2;

// Класс для связи документа с движком рендеринга
public abstract class DocumentRenderer {
    protected RenderEngine engine;

    public DocumentRenderer(RenderEngine engine) {
        this.engine = engine;
    }

    // TODO: Реализовать метод для рендеринга документа
    public abstract void render(String content);
}

