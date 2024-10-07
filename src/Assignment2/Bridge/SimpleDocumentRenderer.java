package Assignment2;

// ЗАДАНИЕ: Реализовать рендеринг документа через выбранный движок
public class SimpleDocumentRenderer extends DocumentRenderer {
    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    @Override
    public void render(String content) {
        // TODO: Вызвать рендеринг через движок
        engine.render(content);
    }
}

