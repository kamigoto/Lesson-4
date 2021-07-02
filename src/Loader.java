import ru.shaikhieva.kr.Cat;

import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {

        Cat cat_1 = new Cat("Kesha");
        Cat cat_2 = new Cat("Agata");
        Cat cat_3 = new Cat("Bob");
        Cat cat_4 = new Cat("Lulu");
        Cat cat_5 = new Cat("Murzik");

        double result = cat_1.getWeight();

        System.out.println("Cat's name: " + cat_1.getName() + ", weight: " + cat_1.getWeight() + " , status:" + cat_1.getStatus());
        System.out.println("Cat's name: " + cat_2.getName() + ", weight: " + cat_2.getWeight() + " , status:" + cat_2.getStatus());
        System.out.println("Cat's name: " + cat_3.getName() + ", weight: " + cat_3.getWeight() + " , status:" + cat_3.getStatus());
        System.out.println("Cat's name: " + cat_4.getName() + ", weight: " + cat_4.getWeight() + " , status:" + cat_4.getStatus());
        System.out.println("Cat's name: " + cat_5.getName() + ", weight: " + cat_5.getWeight() + " , status:" + cat_5.getStatus());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько грамм еды дать " + cat_1.getName() + "?");
        double food = scanner.nextDouble();
        System.out.println("Сколько грамм воды дать " + cat_1.getName() + "?");
        double drink = scanner.nextDouble();

        cat_1.feed(food);
        cat_1.drink(drink);


        System.out.println("Кот " + cat_1.getName() + " съел " + (food +drink));
        System.out.println("Вес " + cat_1.getName() + " = " + cat_1.getWeight());
        cat_1.meow();
        System.out.println(cat_1.getStatus());
    }

}
