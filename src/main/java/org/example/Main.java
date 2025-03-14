package org.example;

import org.example.Controller.Controller;
import org.example.Model.Charakter;
import org.example.Model.Produkt;
import org.example.View.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialisierung der Produkte
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

        // Initialisierung der Charaktere
        List<Charakter> charaktere = new ArrayList<>();

        Charakter c1 = new Charakter(1, "Naruto Uzumaki", "Konoha");
        c1.kaufeProdukt(produkte.get(0)); // Kunai
        c1.kaufeProdukt(produkte.get(3)); // Heiltrank
        c1.kaufeProdukt(produkte.get(8)); // Schattendolch
        c1.kaufeProdukt(produkte.get(5)); // Riesenfächer

        Charakter c2 = new Charakter(2, "Gaara", "Sunagakure");
        c2.kaufeProdukt(produkte.get(2)); // Schwert
        c2.kaufeProdukt(produkte.get(4)); // Sprengsiegel
        c2.kaufeProdukt(produkte.get(6)); // Giftklinge
        c2.kaufeProdukt(produkte.get(1)); // Shuriken

        Charakter c3 = new Charakter(3, "Kisame Hoshigaki", "Kirigakure");
        c3.kaufeProdukt(produkte.get(1)); // Shuriken
        c3.kaufeProdukt(produkte.get(2)); // Schwert
        c3.kaufeProdukt(produkte.get(3)); // Heiltrank
        c3.kaufeProdukt(produkte.get(7)); // Explosionskugel
        c3.kaufeProdukt(produkte.get(9)); // Wasserperle

        Charakter c4 = new Charakter(4, "Deidara", "Iwagakure");
        c4.kaufeProdukt(produkte.get(0)); // Kunai
        c4.kaufeProdukt(produkte.get(4)); // Sprengsiegel
        c4.kaufeProdukt(produkte.get(7)); // Explosionskugel
        c4.kaufeProdukt(produkte.get(9)); // Wasserperle

        Charakter c5 = new Charakter(5, "Itachi Uchiha", "Konoha");
        c5.kaufeProdukt(produkte.get(8)); // Schattendolch
        c5.kaufeProdukt(produkte.get(6)); // Giftklinge
        c5.kaufeProdukt(produkte.get(2)); // Schwert
        c5.kaufeProdukt(produkte.get(7)); // Explosionskugel

        charaktere.add(c1);
        charaktere.add(c2);
        charaktere.add(c3);
        charaktere.add(c4);
        charaktere.add(c5);

        Controller controller = new Controller(produkte, charaktere);
        View view = new View(scanner, controller);

        view.start();
    }
}