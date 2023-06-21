/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.est.tarea_estructura_datos_cuatro;

/**
 *
 * @author davidvargas
 */
import ec.edu.ups.est.tarea_estructura_datos_cuatro.controlador.Controlador;
import ec.edu.ups.est.tarea_estructura_datos_cuatro.modelo.Modelo;
import ec.edu.ups.est.tarea_estructura_datos_cuatro.vista.Vista;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.ejecutar();
    }
}
