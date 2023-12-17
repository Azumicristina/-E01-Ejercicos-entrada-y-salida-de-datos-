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
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo número:"));
        
        String operation = JOptionPane.showInputDialog("Elige una operación (+, -, *, /):");

        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida");
                return;
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + result);
    
    }
    
}
