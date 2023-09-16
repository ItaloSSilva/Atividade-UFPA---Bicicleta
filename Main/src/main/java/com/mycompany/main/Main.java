
package com.mycompany.main;

/**
 *
 * @author silva
 */
public class Main {

    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta(40);

        System.out.println("Estado Inicial da Bicicleta:");
        bike.ImprimirEstado();

        bike.Acelerar();
        bike.Acelerar();

        System.out.println("\nDepois de Acelerar Duas Vezes:");
        bike.ImprimirEstado();

        bike.Frear();

        System.out.println("\nDepois de Frear:");
        bike.ImprimirEstado();
    }
}

