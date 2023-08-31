/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp003_Graf_Danilo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TP003_Graf_Danilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, String> huespedes = new HashMap<Integer, String>();
        huespedes.put(204, "Galarza, Veronica");
        huespedes.put(111, "Gomez, Alberto");
        huespedes.put(11, "Peres, Juan");
        huespedes.put(2087, "Medina, Monica");

        Map<String, Integer> historialVisitas = new HashMap<String, Integer>();
        historialVisitas.put("Hab. Nro 10 de 14:00 a 22:00", 204);
        historialVisitas.put("Hab. Nro 20 de 22:00 a 09:00", 111);
        historialVisitas.put("Hab. Nro 15 de 19:00 a 05:00", 11);
        historialVisitas.put("Hab. Nro 8 de 15:00 a 23:00", 204);
        historialVisitas.put("Hab. Nro 1 de 09:00 a 23:00", 2087);
        historialVisitas.put("Hab. Nro 6 de 09:00 a 23:00", 204);
        historialVisitas.put("Hab. Nro 3 de 09:00 a 15:00", 2087);
        historialVisitas.put("Hab. Nro 23 de 01:00 a 22:00", 2087);
        historialVisitas.put("Hab. Nro 5 de 01:00 a 23:00", 2087);

        ArrayList<String> visitasmonica = new ArrayList<String>();
        String[][] matrizvisitas = new String[2][historialVisitas.size()];

        for (Map.Entry<String, Integer> entrada : historialVisitas.entrySet()) {
            String key = entrada.getKey();
            Integer valor = entrada.getValue();

            if (valor == 2087) {
                visitasmonica.add(key);
            }
        }

        System.out.println("Las visitas de Medina,Monica son: ");
        for (String elementos : visitasmonica) {
            System.out.println("Medina, Monica visito la " + elementos);
        }

        matrizvisitas[0][0] = "Medina, Monica";
        matrizvisitas[1][0] = "Gomez, Alberto";

        for (Map.Entry<String, Integer> entrada : historialVisitas.entrySet()) {
            String key = entrada.getKey();
            Integer valor = entrada.getValue();

            if (valor == 2087) {
                for (int i = 0; i < matrizvisitas[0].length; i++) {
                    if (matrizvisitas[0][i] != null) {
                        continue;
                    }
                    matrizvisitas[0][i] = key;
                }
            }
            if (valor == 111) {
                for (int i = 0; i < matrizvisitas[0].length; i++) {
                    if (matrizvisitas[1][i] != null) {
                        continue;
                    }
                    matrizvisitas[1][i] = key;
                }
            }
        }

        System.out.println("Las visitas de Medina,Monica y Gomez,Alberto son: ");

        for (int i = 0; i < matrizvisitas.length; i++) {
            for (int j = 0; j < matrizvisitas[i].length; j++) {
                System.out.print(matrizvisitas[i][j] + " ");
            }
            System.out.println();
        }

        String mensaje1 = "Felicidades, se resolvieron los Ejercicios.\n"+
                          "Sigue Así, Tu Nota es 10.-";
        JOptionPane.showMessageDialog(null, mensaje1, "Información", JOptionPane.INFORMATION_MESSAGE);

    }

}
