import AbstractFactory.Application;
import AbstractFactory.GUIFactory;
import AbstractFactory.MacOSFactory;
import AbstractFactory.WindowsFactory;
import Assignment1.*;
import Builder.*;
import FactoryMethod.CircleFactory;
import FactoryMethod.Shape;
import FactoryMethod.ShapeFactory;
import FactoryMethod.SquareFactory;
import LSP.Bird;
import LSP.FlyingBird;
import LSP.Penguin;
import Prototype.Enemy;
import Prototype.EnemyRegistry;
import SRP.Invoice;
import SRP.InvoiceEmailSender;
import SRP.InvoiceRepository;
import Singleton.Logger;

import static LSP.BirdSimulator.makeItMove;

public class Main {
    public static void main(String[] args) {
// Фабричный метод: создание фигур
        //Мы создаём фигуры с помощью фабрик CircleFactory и SquareFactory.
        // Для каждой фабрики вызываем метод createShape(), который возвращает объекты соответствующих фигур.
        System.out.println("Фабричный метод:");
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory squareFactory = new SquareFactory();

        Shape circle = circleFactory.createShape();
        Shape square = squareFactory.createShape();

        circle.draw(); // Вывод: Рисуем круг.
        square.draw(); // Вывод: Рисуем квадрат.

        // Абстрактная фабрика: создание GUI элементов
        //Используем две фабрики MacOSFactory и WindowsFactory для создания интерфейсных элементов (кнопки и чекбоксы).
        // Для каждой фабрики создаём отдельное приложение, которое вызывает методы click() и check().
        System.out.println("\nАбстрактная фабрика:");
        GUIFactory macFactory = new MacOSFactory();
        GUIFactory windowsFactory = new WindowsFactory();

        Application macApp = new Application(macFactory);
        Application windowsApp = new Application(windowsFactory);

        macApp.useUI(); // Вывод: Клик по кнопке MacOS. Отметка чекбокса MacOS.
        windowsApp.useUI(); // Вывод: Клик по кнопке Windows. Отметка чекбокса Windows.

        // Строитель: создание пиццы
        //Сначала создаётся гавайская пицца с помощью строителя HawaiianPizzaBuilder,
        // затем острая пицца с помощью SpicyPizzaBuilder.
        // Оба строителя управляются через директора (Waiter).
        System.out.println("\nСтроитель:");
        Waiter waiter = new Waiter();

        // Создание гавайской пиццы
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        Pizza hawaiianPizza = waiter.getPizza();
        hawaiianPizza.showIngredients(); // Вывод: Пицца с тестом: мягкое тесто, соусом: сладкий соус, начинкой: ветчина и ананас

        // Создание острой пиццы
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        Pizza spicyPizza = waiter.getPizza();
        spicyPizza.showIngredients(); // Вывод: Пицца с тестом: тонкое тесто, соусом: острый соус, начинкой: пепперони и перец чили

        // Прототип: клонирование врагов
        // Клонируются два орка и один гоблин с помощью метода createEnemy() из реестра EnemyRegistry.
        // Все они вызывают метод attack(), демонстрируя работу паттерна прототипа.
        System.out.println("\nПрототип:");
        EnemyRegistry enemyRegistry = new EnemyRegistry();

        Enemy orc1 = enemyRegistry.createEnemy("orc");
        Enemy orc2 = enemyRegistry.createEnemy("orc");
        Enemy goblin1 = enemyRegistry.createEnemy("goblin");

        orc1.attack(); // Вывод: Орк атакует!
        orc2.attack(); // Вывод: Орк атакует!
        goblin1.attack(); // Вывод: Гоблин атакует!

        // Одиночка (Singleton)
        // Получаем экземпляр класса Logger
        Logger logger1 = Logger.getInstance();
        logger1.log("Это первое сообщение в лог.");

        // Пытаемся создать ещё один экземпляр
        Logger logger2 = Logger.getInstance();
        logger2.log("Это второе сообщение в лог.");

        // Проверка, что оба объекта ссылаются на один и тот же экземпляр
        System.out.println("Оба логгера ссылаются на один и тот же экземпляр: " + (logger1 == logger2));
    }
}