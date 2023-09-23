package view;

import java.util.Scanner;

public class Menu extends AbstractMenu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    @Override
    public int getMenuChoice() {
        displayMenu();
        System.out.println("Chon mot lua chon tu menu: ");
        return scanner.nextInt();
    }
}
