package com.company;
import java.io.PrintStream;
import java.util.ArrayList;
import java.io.*;

public class Main {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public Main() {}
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenido al Poker!");
        System.out.println("Selecciona una opción:");
        System.out.println("1.Mezclar deck");
        System.out.println("2.Sacar una carta");
        System.out.println("3.Carta al azar");
        System.out.println("4.Generar una mano de 5 cartas");
        System.out.println("0 Salir");
        int op = Integer.parseInt (entrada.readLine());
        String[] Palo = new String[]{"treboles", "corazones", "picas", "diamantes"};
        String[] Valor = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        Deck deck = new Deck();
        deck.setCard(new ArrayList());
        for(int i = 0; i < Palo.length; ++i) {
            for(int j = 0; j < Valor.length; ++j) {
                Card card = new Card(Palo[i], getColor(Palo[i]), Valor[j]);
                deck.getCard().add(card);}}
        switch (op){
            case 1:
        System.out.println("Tamaño del deck: " + deck.getCard().size());
        System.out.println("Mezclar el deck " + deck.mezclar());
        PrintStream var10000 = System.out;
        String var10001 = ((Card)deck.getCard().get(0)).getPalo();
        var10000.println("Prmera: " + var10001 + " " + ((Card)deck.getCard().get(0)).getValor());
        System.out.println("Quedan: 51");
        var10000 = System.out;
        var10001 = ((Card)deck.getCard().get(0)).getPalo();
        var10000.println("Segunda: " + var10001 + " " + ((Card)deck.getCard().get(1)).getValor());
        var10000 = System.out;
        var10001 = ((Card)deck.getCard().get(0)).getPalo();
        var10000.println("Tercera: " + var10001 + " " + ((Card)deck.getCard().get(2)).getValor());
        var10000 = System.out;
        var10001 = ((Card)deck.getCard().get(0)).getPalo();
        var10000.println("Cuarta: " + var10001 + " " + ((Card)deck.getCard().get(3)).getValor());
        var10000 = System.out;
        var10001 = ((Card)deck.getCard().get(0)).getPalo();
        var10000.println("Quinta: " + var10001 + " " + ((Card)deck.getCard().get(4)).getValor());
                break;
            case 2:
                PrintStream var10010 = System.out;
                String var10011 = ((Card)deck.getCard().get(0)).getPalo();
                var10010.println("La carta sacada es: " + var10011 + " " + ((Card)deck.getCard().get(0)).getValor());
                System.out.println("Quedan: 51");
                var10000 = System.out;
                var10011 = ((Card)deck.getCard().get(0)).getPalo();
                break;
            case 3:
                PrintStream var10014 = System.out;
                String var10012 = ((Card)deck.getCard().get(0)).getPalo();
                var10014.println("La carta al azar es: " + var10012 + " " + ((Card)deck.getCard().get(0)).getValor());
                System.out.println("Quedan: 51");
                var10014 = System.out;
                var10012 = ((Card)deck.getCard().get(0)).getPalo();
                break;
            case 4:
                PrintStream var10055 = System.out;
                String var100054 = ((Card)deck.getCard().get(0)).getPalo();
                var10055.println("Prmera: " + var100054 + " " + ((Card)deck.getCard().get(0)).getValor());
                System.out.println("Quedan: 51");
                var10000 = System.out;
                var10001 = ((Card)deck.getCard().get(0)).getPalo();
                var10000.println("Segunda: " + var10001 + " " + ((Card)deck.getCard().get(1)).getValor());
                var10000 = System.out;
                var10001 = ((Card)deck.getCard().get(0)).getPalo();
                var10000.println("Tercera: " + var10001 + " " + ((Card)deck.getCard().get(2)).getValor());
                var10000 = System.out;
                var10001 = ((Card)deck.getCard().get(0)).getPalo();
                var10000.println("Cuarta: " + var10001 + " " + ((Card)deck.getCard().get(3)).getValor());
                var10000 = System.out;
                var10001 = ((Card)deck.getCard().get(0)).getPalo();
                var10000.println("Quinta: " + var10001 + " " + ((Card)deck.getCard().get(4)).getValor());
                break;
            case 5:
            default:
                System.out.println("Saliendo...");
        }}

    public static String getColor(String palo) {
        if (!palo.toLowerCase().equals("Picas") && !palo.toLowerCase().equals("Tréboles")) {
            return !palo.toLowerCase().equals("Corazones") && !palo.toLowerCase().equals("Diamantes") ? null : "rojo";
        } else {
            return "negro";}}}
