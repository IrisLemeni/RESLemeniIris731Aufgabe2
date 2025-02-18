package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        View view = new View(scanner, controller);

        List<Produkt> produkte = new ArrayList<>();
        produkte.add(new Produkt("Kunai", 50.0, "Konoha"));
        produkte.add(new Produkt("Shuriken", 30.0, "Konoha"));
        produkte.add(new Produkt("Schwert", 200.0, "Kirigakure"));
        produkte.add(new Produkt("Heiltrank", 100.0, "Sunagakure"));
        produkte.add(new Produkt("Sprengsiegel", 75.0, "Iwagakure"));
        produkte.add(new Produkt("Riesenfächer", 300.0, "Sunagakure"));
        produkte.add(new Produkt("Giftklinge", 150.0, "Kirigakure"));
        produkte.add(new Produkt("Explosionskugel", 250.0, "Iwagakure"));
        produkte.add(new Produkt("Schattendolch", 180.0, "Konoha"));
        produkte.add(new Produkt("Wasserperle", 90.0, "Kirigakure"));
        view.start();
    }
}