/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.tarea_estructura_datos_cuatro.modelo;

import java.util.Stack;

/**
 *
 * @author davidvargas
 */
public class Modelo {
    private Stack<Character> pila;

    public Modelo() {
        pila = new Stack<>();
    }

    public boolean agregarCaracter(char caracter) {
        if (caracter == '{' || caracter == '[' || caracter == '(') {
            pila.push(caracter);
        } else if (caracter == '}' || caracter == ']' || caracter == ')') {
            if (!pila.isEmpty()) {
                char ultimoCaracter = pila.peek();
                if ((caracter == '}' && ultimoCaracter == '{') ||
                        (caracter == ']' && ultimoCaracter == '[') ||
                        (caracter == ')' && ultimoCaracter == '(')) {
                    pila.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public Stack<Character> getPila() {
        return pila;
    }
}
