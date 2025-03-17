package view;

import service.MainService;

import java.util.Scanner;

public class Menu {

    private final MainService service;
    private final Scanner scanner = new Scanner(System.in);




    public Menu(MainService service) {
        this.service = service;
    }

    public void start() {
        showMenu();
    }

    private void showMenu() {
        while (true) {
            System.out.println("Добро пожаловать в меню");
            System.out.println("1. Меню автомобилей");
            System.out.println("2. Меню автомобилей");
            System.out.println("3. Меню автомобилей");
            System.out.println("0. Меню автомобилей");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("До свидания");
                // Завершение работы приложения
                System.exit(0);
            }

            showSubMenu(choice);
        }
    }

    private void showSubMenu(int choice) {
        switch (choice) {
            case 1:
                // Todo show car menu
                break;
            case 2:
                // Todo show User menu
                showUserMenu();
                break;
            case 3:
                // Todo show admin menu
                break;
            default:
                System.out.println("\n");
                waitRead();
        }
    }

    private void showUserMenu() {
        while (true) {
            System.out.println("Меню пользователя:");
            System.out.println("1. Login");
            System.out.println("2. Регистрация ");
            System.out.println("2. Регистрация ");

            int input = scanner.nextInt();
            scanner.nextLine();

            handleUserMenuInput(input);
        }

    }

    private void handleUserMenuInput(int input) {
        switch (input) {
            case 1:
                /*

                 */
                break;
            case 2:
                /*

                 */
                break;
        }

    }

    private void waitRead() {
        System.out.println("\nДля продолжения нажмите Enter...");
        scanner.nextLine();
    }


}
