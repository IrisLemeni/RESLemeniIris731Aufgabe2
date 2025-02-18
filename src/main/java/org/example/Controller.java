package org.example;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Produkt> produkte;

    public Controller() {
        this.produkte = new ArrayList<>();
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
}
