/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.tarea_estructura_datos_cuatro.vista;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author davidvargas
 */
public class Vista {
    public String obtenerCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cadena de signos: ");
        return scanner.nextLine();
    }

    public void imprimirPila(Stack<Character> pila) {
        for (char c : pila) {
            System.out.print(c + ", ");
        }
        System.out.println();
    }

    public void mostrarResultado(boolean balanceada) {
        if (balanceada) {
            System.out.println("La cadena está balanceada");
        } else {
            System.out.println("La cadena no está balanceada");
        }
    }
}
