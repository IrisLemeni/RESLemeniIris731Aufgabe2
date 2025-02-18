package org.example.Model;

import java.util.ArrayList;

public class Charakter {
    private int id;
    private String name;
    private String ort;
    private ArrayList<Produkt> produkte;

    public Charakter(int id, String name, String ort) {
        this.id = id;
        this.name = name;
        this.ort = ort;
        this.produkte = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public ArrayList<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(ArrayList<Produkt> produkte) {
        this.produkte = produkte;
    }

    @Override
    public String toString() {
        return "Charakter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ort='" + ort + '\'' +
                ", produkte=" + produkte +
                '}';
    }

    public void add(Produkt produkt){
        this.produkte.add(produkt);
    }

    public void kaufeProdukt(Produkt produkt) {
        this.produkte.add(produkt);
    }
}
