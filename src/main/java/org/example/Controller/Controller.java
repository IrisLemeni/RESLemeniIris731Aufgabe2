package org.example.Controller;

import org.example.Model.Charakter;
import org.example.Model.Produkt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Controller {
    private List<Produkt> produkte;
    private List<Charakter> charakters;

    public Controller() {
        this.produkte = new ArrayList<>();
        this.charakters = new ArrayList<>();
    }

    public Controller(List<Produkt> produkte,List<Charakter> charakters){
        this.produkte = produkte;
        this.charakters = charakters;
    }

    public void addProdukt(Produkt produkt){
        this.produkte.add(produkt);
    }

    public void printProdukte(){
        int i = 1;
        if(!produkte.isEmpty()){
            for(Produkt produkt : produkte){
                System.out.println(i + "." + produkt);
                i++;
            }
        }
    }

    public void updateProdukt(int index, Produkt produkt){
        this.produkte.set(index -1, produkt);
    }

    public void deleteProdukt(int index){
        this.produkte.remove(index - 1);
    }

    public void addCharacter(Charakter charakter){
        this.charakters.add(charakter);
    }

    public void printCharacter(){
        int i = 1;
        if(!charakters.isEmpty()){
            for(Charakter charakter : charakters){
                System.out.println(i + "." + charakter);
                i++;
            }
        }
    }

    public void updateCharacter(int index, Charakter charakter){
        this.charakters.set(index - 1, charakter);
    }

    public void deleteCharacter(int index){
        this.charakters.remove(index - 1);
    }

    public void filterCharacterByOrt(String ort){
       this.charakters.stream()
                .filter(c -> c.getOrt().equals(ort))
                .map(c -> c.getName())
                .forEach(n -> System.out.println(n));
    }

    public void characterByProduktOrt(String ort){
        this.charakters.stream()
                .filter(c -> c.getProdukte().stream()
                        .anyMatch(p -> p.getRegion().equals(ort)))
                .map(c -> c.getName())
                .sorted()
                .forEach(n -> System.out.println(n));
    }

    public List<Produkt> sortedProducts(String character, String order){
        Charakter charakter = charakters.stream()
                .filter(c -> c.getName().equals(character.trim()))
                .findFirst()
                .orElse(null);

        if(charakter != null){
            List<Produkt> produkte = charakter.getProdukte();
            if (order.trim().equals("Aufsteigend")){
                produkte.sort(Comparator.comparing(Produkt::getPreis));
            } else if (order.trim().equals("Absteigend")) {
                produkte.sort(Comparator.comparing(Produkt::getPreis).reversed());
            }
            return produkte;
        }
        return null;
    }
}
