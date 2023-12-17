/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 5) + 1;
        int guess = 0;

        do {
            guess = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número (entre 1 y 5):"));

            if (guess == targetNumber) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste el número correcto.");
            } else {
                JOptionPane.showMessageDialog(null, "¡Inténtalo de nuevo!");
            }
        } while (guess != targetNumber);
    }
}
