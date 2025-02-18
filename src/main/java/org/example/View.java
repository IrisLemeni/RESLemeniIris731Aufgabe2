package org.example;

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
}
