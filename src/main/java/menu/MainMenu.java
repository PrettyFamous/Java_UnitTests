package menu;

import java.util.Scanner;

public class MainMenu {

    Scanner in = new Scanner(System.in);

    public int showMenu() {
        System.out.println("Выберете действие:");
        System.out.println("1 -> Добавить элемент");
        System.out.println("2 -> Найти элемент по ключу");
        System.out.println("3 -> Количество элементов в очереди");
        System.out.println("4 -> Максимальное к-во элементов в очереди");
        System.out.println("0 -> Выход");

        return in.nextInt();
    }

    public int inputKey(){
        System.out.println("Введите ключ: ");
        return in.nextInt();
    }

    public String inputValue(){
        System.out.println("Введите значение: ");
        return in.next();
    }
}
