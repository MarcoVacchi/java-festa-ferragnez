package com.ferragnez.party.java;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        Scanner input = new Scanner(System.in);

        String name;

        System.out.print("Scrivi il tuo nome: ");
        name = input.nextLine();
        input.close();

        boolean isPersonInList = false;
        int index = 0;

        while (!isPersonInList && index < listaInvitati.length) {
            if (name.equalsIgnoreCase(listaInvitati[index])) {
                isPersonInList = true;
                System.out.println("Persona nella lista in posizione: " + index);
            } else {
                index++;
                System.out.println("Persona non presente nella lista");
            }
        }

        // for (int i = 0; i < listaInvitati.length; i++) {
        // System.out.println(listaInvitati[i]);
        // if (name.equalsIgnoreCase(listaInvitati[i])) {
        // System.out.println("Nome nella lista in posizione: " + i);
        // break;
        // } else {
        // System.out.println("Nome non presente");
        // }
        // }

    }
}

// Nel programma occorre:
// - creare e inizializzare l’array contenente i nomi degli invitati
// - chiedere all’utente come si chiama
// - verificare che il nome sia presente nella lista
// - lasciarlo entrare o rispedirlo cortesemente da dove è venuto
// :occhiali_da_sole:

// Bonus
// se avete usato il ciclo for per cercare il nome nella lista nella consegna
// base, implementare lo stesso programma usando il ciclo while, e viceversa

// Lista invitati:
// Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi,
// Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic