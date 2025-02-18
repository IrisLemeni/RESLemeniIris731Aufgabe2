package org.example.Controller;

import org.example.Model.Charakter;
import org.example.Model.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Produkt> produkte;
    private List<Charakter> charakters;

    public Controller() {
        this.produkte = new ArrayList<>();
        this.charakters = new ArrayList<>();
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
}
