
package com.mycompany.main;

/**
 *
 * @author silva
 */
public class Bicicleta extends Main {
    private double Velocidade, Marcha;
    private final double VelocidadeMaxima;
    // construtor 
    public Bicicleta(double VelocidadeMaxima) {
        this.Velocidade = 0;
        this.Marcha = 0;
        this.VelocidadeMaxima = VelocidadeMaxima;
    }

    // método acelerar
    public void Acelerar() {
        if (Marcha < 7) {
            Marcha++;
            if (Velocidade + 10 <= VelocidadeMaxima) {
                Velocidade += 10;
        } else {
            System.out.println("A marcha máxima foi alcançada.");
        }
      }
    }
    // método frear
    
    public void Frear() {
        if (Velocidade > 0) {
            Velocidade -= 10;
        } else {
            System.out.println("A bike já está parada.");
        }
    }
    
    // método estado atual da bike
    
    public void ImprimirEstado() {
        System.out.println("Velocidade Máxima: " + VelocidadeMaxima + " km/h");
        System.out.println("Marcha: " + Marcha);
        System.out.println("Velocidade: " + Velocidade + " km/h");
    }
    public double getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(double Velocidade) {
        this.Velocidade = Velocidade;
    }

    public double getMarcha() {
        return Marcha;
    }

    public void setMarcha(double Marcha) {
        this.Marcha = Marcha;
    }
    
    
}
