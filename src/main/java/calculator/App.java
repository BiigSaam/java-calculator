package calculator;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        StringBuilder resultats = new StringBuilder();
        resultats.append("Addition: ").append(Calculatrice.addition(a, b)).append("\n");
        resultats.append("Soustraction: ").append(Calculatrice.soustraction(a, b)).append("\n");
        resultats.append("Multiplication: ").append(Calculatrice.multiplication(a, b)).append("\n");
        resultats.append("Division: ").append(Calculatrice.division(a, b)).append("\n");

        JOptionPane.showMessageDialog(null, resultats.toString(), "Résultats Calculatrice", JOptionPane.INFORMATION_MESSAGE);
    }
}
