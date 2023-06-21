/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.tarea_estructura_datos_cuatro.controlador;

import ec.edu.ups.est.tarea_estructura_datos_cuatro.modelo.Modelo;
import ec.edu.ups.est.tarea_estructura_datos_cuatro.vista.Vista;

/**
 *
 * @author davidvargas
 */
public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        String cadena = vista.obtenerCadena();

        for (char caracter : cadena.toCharArray()) {
            if (!modelo.agregarCaracter(caracter)) {
                vista.mostrarResultado(false);
                return;
            }

            vista.imprimirPila(modelo.getPila());
        }

        vista.mostrarResultado(modelo.getPila().isEmpty());
    }
}
