package org.example.View;

import org.example.Controller.Controller;
import org.example.Model.Charakter;
import org.example.Model.Produkt;

import java.util.List;
import java.util.Scanner;

public class View {
    private Controller controller;
    private Scanner scanner;

    public View(Scanner scanner, Controller controller) {
        this.scanner = scanner;
        this.controller = controller;
    }

    public void start() {
        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. List Products");
            System.out.println("5. Add Character");
            System.out.println("6. Update Character");
            System.out.println("7. Delete Character");
            System.out.println("8. List Characters");
            System.out.println("9. Filter by Herkunftort");
            System.out.println("10. Filter Character By Produkt Ort");
            System.out.println("11. Sort Products By Character and Price");
            int choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProdukt();
                    break;
                case 2:
                    updateProdukt();
                    break;
                case 3:
                    deleteProdukt();
                    break;
                case 4:
                    listProdukt();
                    break;
                case 5:
                    addCharacter();
                    break;
                case 6:
                    updateCharacter();
                    break;
                case 7:
                    deleteCharacter();
                    break;
                case 8:
                    listCharacter();
                    break;
                case 9:
                    filterCharacterByOrt();
                    break;
                case 10:
                    filterCharacterByProduktOrt();
                    break;
                case 11:
                    sortCharacterProducts();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong input");
            }
        }
    }

    public void addProdukt(){
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product price: ");
        double price = Double.valueOf(scanner.nextLine());
        System.out.println("Enter product region: ");
        String region = scanner.nextLine();
        Produkt produkt = new Produkt(name, price, region);
        controller.addProdukt(produkt);
    }

    private void updateProdukt() {
        controller.printProdukte();
        System.out.println("Enter the index of the product to update: ");
        int index = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter new product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new product price: ");
        double price = Double.valueOf(scanner.nextLine());
        System.out.println("Enter new product region: ");
        String region = scanner.nextLine();
        Produkt produkt = new Produkt(name, price, region);
        controller.updateProdukt(index, produkt);
    }

    private void deleteProdukt(){
        controller.printProdukte();
        System.out.println("Enter the index of the product to delete: ");
        int index = Integer.valueOf(scanner.nextLine());
        controller.deleteProdukt(index);
    }

    private void listProdukt(){
        controller.printProdukte();
    }

    private void addCharacter() {
        System.out.println("Enter character ID: ");
        int id = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter character name: ");
        String name = scanner.nextLine();
        System.out.println("Enter character city: ");
        String city = scanner.nextLine();
        Charakter character = new Charakter(id, name, city);
        controller.addCharacter(character);
    }

    private void updateCharacter() {
        listCharacter();
        System.out.println("Enter the index of the character to update: ");
        int index = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter new character ID: ");
        int id = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter new character name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new character city: ");
        String city = scanner.nextLine();
        Charakter character = new Charakter(id, name, city);
        controller.updateCharacter(index, character);
    }

    private void deleteCharacter() {
        listCharacter();
        System.out.println("Enter the index of the customer to delete: ");
        int index = Integer.valueOf(scanner.nextLine());
        controller.deleteCharacter(index);
        System.out.println("Customer deleted!");
    }

    private void listCharacter() {
        controller.printCharacter();
    }

    public void filterCharacterByOrt(){
        System.out.println("Give Herkunftsort: ");
        String ort = scanner.nextLine();
        controller.filterCharacterByOrt(ort);
    }

    public void filterCharacterByProduktOrt(){
        System.out.println("Give Produkt Ort");
        String ort = scanner.nextLine();
        controller.characterByProduktOrt(ort);
    }

    private void sortCharacterProducts() {
        System.out.println("Enter character name: ");
        String name = scanner.nextLine();
        System.out.println("Sortierreihenfolge: ");
        String order = scanner.nextLine();
        List<Produkt> products = controller.sortedProducts(name, order);
        if (products != null) {
            for (Produkt product : products) {
                System.out.println(product.getName() + " - " + product.getPreis());
            }
        } else {
            System.out.println("Customer not found!");
        }
    }


}
