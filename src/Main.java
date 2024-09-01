//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Plate plate = new Plate(20);

        Cat[] cats = {cat1, cat2};

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getClass().getSimpleName() + " satiety: " + cat.isSatiety());
        }

        plate.addFood(10);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getClass().getSimpleName() + " satiety: " + cat.isSatiety());
        }

        System.out.println("Total animals: " + Animal.animalCount);
        System.out.println("Total dogs: " + Dog.dogCount);
        System.out.println("Total cats: " + Cat.catCount);

        //Вывод второго задания
        Shape circle = new Circle(5, "Red", "Black");
        Shape rectangle = new Rectangle(4, 7, "Blue", "Green");
        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Orange");

        circle.printDetails();
        rectangle.printDetails();
        triangle.printDetails();
    }
}