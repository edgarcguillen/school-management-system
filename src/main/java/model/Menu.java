package model;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);

    public int promptForMenuSelection(String prompt) {
        int menuSelection;
        System.out.print(prompt);
        try {
            menuSelection = Integer.parseInt(scanner.nextLine());
            System.out.println();
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }

    public void printMainMenu() {
        System.out.println();
        System.out.println("----School Main Menu----");
        System.out.println("1: List Students");
        System.out.println("2: List School Details");
        System.out.println("3: List Academic Degrees");
        System.out.println();
    }







    public void pause() {
        System.out.println("\n(Or press Enter to return to the main menu...)");
        scanner.nextLine();
    }


}
