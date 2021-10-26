package com.company;

public class Card {
    private String palo;
    private String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.valor = valor;}
    public String getPalo() {
        return this.palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }}