import Assignment2.*;
import Assignment2.Adapter.PDFDocumentAdapter;
import Assignment2.Bridge.HighlightRenderEngine;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleRenderEngine;
import Assignment2.Composite.DocumentGroup;
import Assignment2.Facade.DocumentFacade;
import Assignment2.Flyweight.DocumentFactory;
import StructuralPatterns.Adapter.AudioPlayer;
import StructuralPatterns.Bridge.Circle;
import StructuralPatterns.Bridge.GreenCircle;
import StructuralPatterns.Bridge.RedCircle;
import StructuralPatterns.Bridge.Shape;
import StructuralPatterns.Composite.CompanyDirectory;
import StructuralPatterns.Composite.Developer;
import StructuralPatterns.Composite.Manager;
import StructuralPatterns.Decorator.BasicCar;
import StructuralPatterns.Decorator.Car;
import StructuralPatterns.Decorator.LuxuryCar;
import StructuralPatterns.Decorator.SportsCar;
import StructuralPatterns.Facade.ComputerFacade;
import StructuralPatterns.Flyweight.ShapeFactory;
import StructuralPatterns.Proxy.Image;
import StructuralPatterns.Proxy.ProxyImage;


public class Main {
    private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        //Adapter

        // Создание экземпляра AudioPlayer
        AudioPlayer audioPlayer = new AudioPlayer();

        // Воспроизведение различных типов файлов
        audioPlayer.play("song.mp3");    // Воспроизведение MP3 напрямую
        audioPlayer.play("video.vlc");   // Воспроизведение VLC через адаптер
        audioPlayer.play("movie.mp4");   // Воспроизведение MP4 через адаптер
        audioPlayer.play("audio.wma");   // Несуществующий формат

        System.out.println("\n");
        //Bridge
        // Создание фигур с различными реализациями отрисовки
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(200, 200, 20, new GreenCircle());

        // Вызов метода draw для каждой фигуры
        redCircle.draw();  // Выводит: Drawing Circle[ color: red, radius: 10, x: 100, y: 100]
        greenCircle.draw(); // Выводит: Drawing Circle[ color: green, radius: 20, x: 200, y: 200]


        //Composite Pattern
        // Создание объектов сотрудников
        Developer dev1 = new Developer("John Doe", 101);
        Developer dev2 = new Developer("Jane Doe", 102);

        Manager manager1 = new Manager("Sarah Connor", 103);

        // Создание компании и добавление сотрудников
        CompanyDirectory engineeringDirectory = new CompanyDirectory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);

        CompanyDirectory managementDirectory = new CompanyDirectory();
        managementDirectory.addEmployee(manager1);
        managementDirectory.showEmployeeDetails();

        // Основная компания, объединяющая все отделы
        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(engineeringDirectory);
        companyDirectory.addEmployee(managementDirectory);

        // Отображение информации обо всех сотрудниках
        companyDirectory.showEmployeeDetails();


        //Decorator
        // Создание базового автомобиля
        Car basicCar = new BasicCar();
        System.out.println("Basic Car:");
        basicCar.assemble();

        System.out.println("\n\nSports Car:");
        // Создание спортивного автомобиля с базовой функциональностью
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("\n\nLuxury Sports Car:");
        // Создание роскошного спортивного автомобиля
        Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxurySportsCar.assemble();

        //Facade
        // Использование фасада для запуска компьютера
        System.out.println("\n");
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();  // Запускает всю систему через фасад


        //Flyweight
        System.out.println("\n");
        for (int i = 0; i < 20; i++) {
            // Генерируем случайные параметры для круга
            String color = getRandomColor();
            int x = getRandomX();
            int y = getRandomY();
            int radius = getRandomRadius();

            // Получаем круг из фабрики
            StructuralPatterns.Flyweight.Circle circle = (StructuralPatterns.Flyweight.Circle) ShapeFactory.getCircle(color);

            // Отрисовываем круг с уникальными координатами и радиусом
            circle.draw(x, y, radius);
        }

        //Proxy pattern
        // Создаём изображение через Proxy
        Image image = new ProxyImage("test_image.jpg");

        // Изображение будет загружено с диска только при первом вызове display()
        System.out.println("First call:");
        image.display();  // Загружает и отображает изображение

        // При повторном вызове изображение не загружается заново
        System.out.println("\nSecond call:");
        image.display();  // Просто отображает изображение без повторной загрузки

        DocumentFacade facade = new DocumentFacade();

        // 1. Использование Proxy для ленивой загрузки
        System.out.println("1. Ленивая загрузка документов:");
        facade.displayDocument("Report");

        // 2. Использование декоратора для добавления водяного знака
        System.out.println("\n2. Добавление водяного знака:");
        facade.displayDocumentWithWatermark("Report");

        // 3. Использование Flyweight для повторного использования документа
        System.out.println("\n3. Повторное использование документа:");
        facade.displayDocument("Report");

        // 4. Использование Composite для работы с группой документов
        System.out.println("\n4. Работа с группами документов:");
        DocumentGroup group = new DocumentGroup();
        group.addDocument(DocumentFactory.getDocument("Report"));
        group.addDocument(DocumentFactory.getDocument("Presentation"));
        group.display();

        // 5. Использование Adapter для работы с PDF
        System.out.println("\n5. Работа с PDF документами через Adapter:");
        Document pdfDocument = new PDFDocumentAdapter("document.pdf");
        pdfDocument.display();

        // 6. Использование Bridge для рендеринга
        System.out.println("\n6. Рендеринг документа через движок:");
        RenderEngine simpleEngine = new SimpleRenderEngine();
        facade.renderDocument("Report", simpleEngine);

        RenderEngine highlightEngine = new HighlightRenderEngine();
        facade.renderDocument("Report", highlightEngine);

//// Фабричный метод: создание фигур
//        //Мы создаём фигуры с помощью фабрик CircleFactory и SquareFactory.
//        // Для каждой фабрики вызываем метод createShape(), который возвращает объекты соответствующих фигур.
//        System.out.println("Фабричный метод:");
//        ShapeFactory circleFactory = new CircleFactory();
//        ShapeFactory squareFactory = new SquareFactory();
//
//        Shape circle = circleFactory.createShape();
//        Shape square = squareFactory.createShape();
//
//        circle.draw(); // Вывод: Рисуем круг.
//        square.draw(); // Вывод: Рисуем квадрат.
//
//        // Абстрактная фабрика: создание GUI элементов
//        //Используем две фабрики MacOSFactory и WindowsFactory для создания интерфейсных элементов (кнопки и чекбоксы).
//        // Для каждой фабрики создаём отдельное приложение, которое вызывает методы click() и check().
//        System.out.println("\nАбстрактная фабрика:");
//        GUIFactory macFactory = new MacOSFactory();
//        GUIFactory windowsFactory = new WindowsFactory();
//
//        Application macApp = new Application(macFactory);
//        Application windowsApp = new Application(windowsFactory);
//
//        macApp.useUI(); // Вывод: Клик по кнопке MacOS. Отметка чекбокса MacOS.
//        windowsApp.useUI(); // Вывод: Клик по кнопке Windows. Отметка чекбокса Windows.
//
//        // Строитель: создание пиццы
//        //Сначала создаётся гавайская пицца с помощью строителя HawaiianPizzaBuilder,
//        // затем острая пицца с помощью SpicyPizzaBuilder.
//        // Оба строителя управляются через директора (Waiter).
//        System.out.println("\nСтроитель:");
//        Waiter waiter = new Waiter();
//
//        // Создание гавайской пиццы
//        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
//        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
//        waiter.constructPizza();
//        Pizza hawaiianPizza = waiter.getPizza();
//        hawaiianPizza.showIngredients(); // Вывод: Пицца с тестом: мягкое тесто, соусом: сладкий соус, начинкой: ветчина и ананас
//
//        // Создание острой пиццы
//        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
//        waiter.setPizzaBuilder(spicyPizzaBuilder);
//        waiter.constructPizza();
//        Pizza spicyPizza = waiter.getPizza();
//        spicyPizza.showIngredients(); // Вывод: Пицца с тестом: тонкое тесто, соусом: острый соус, начинкой: пепперони и перец чили
//
//        // Прототип: клонирование врагов
//        // Клонируются два орка и один гоблин с помощью метода createEnemy() из реестра EnemyRegistry.
//        // Все они вызывают метод attack(), демонстрируя работу паттерна прототипа.
//        System.out.println("\nПрототип:");
//        EnemyRegistry enemyRegistry = new EnemyRegistry();
//
//        Enemy orc1 = enemyRegistry.createEnemy("orc");
//        Enemy orc2 = enemyRegistry.createEnemy("orc");
//        Enemy goblin1 = enemyRegistry.createEnemy("goblin");
//
//        orc1.attack(); // Вывод: Орк атакует!
//        orc2.attack(); // Вывод: Орк атакует!
//        goblin1.attack(); // Вывод: Гоблин атакует!
//
//        // Одиночка (Singleton)
//        // Получаем экземпляр класса Logger
//        Logger logger1 = Logger.getInstance();
//        logger1.log("Это первое сообщение в лог.");
//
//        // Пытаемся создать ещё один экземпляр
//        Logger logger2 = Logger.getInstance();
//        logger2.log("Это второе сообщение в лог.");
//
//        // Проверка, что оба объекта ссылаются на один и тот же экземпляр
//        System.out.println("Оба логгера ссылаются на один и тот же экземпляр: " + (logger1 == logger2));
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomRadius() {
        return (int) (Math.random() * 50);
    }
}