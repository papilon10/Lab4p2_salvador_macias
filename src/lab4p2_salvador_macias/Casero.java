/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_salvador_macias;

import java.util.ArrayList;
import static lab4p2_salvador_macias.Lab4p2_salvador_macias.lista_inquilinos;
import static lab4p2_salvador_macias.Lab4p2_salvador_macias.lista_limpiadores;

/**
 *
 * @author Apple
 */
public class Casero extends Persona {

    public ArrayList notificaciones_suciedad = new ArrayList();

    public Casero(String nombre) {
        super(nombre);
    }

    public ArrayList getNotificaciones_suciedad() {
        return notificaciones_suciedad;
    }

    public void setNotificaciones_suciedad(ArrayList notificaciones_suciedad) {
        this.notificaciones_suciedad = notificaciones_suciedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void desalojar(Edificio edificio_default) {
        if (Lab4p2_salvador_macias.lista_apartamentos.isEmpty()) {
          //  System.out.println("no hay inquilinos a desalojar ");
        } else {
            for (int i = 0; i < lista_inquilinos.size(); i++) {
                System.out.println(
                        lista_inquilinos.indexOf(lista_inquilinos.get(i)) + "-"
                        + lista_inquilinos.get(i)
                );
            }

        }
        
    }

    public static void despedir(Edificio edificio_default) {
        if (lista_limpiadores.isEmpty()) {
            //System.out.println("no hay limpiadores para despedir");

        } else {
            for (int i = 0; i < lista_limpiadores.size(); i++) {
                System.out.println(
                        lista_limpiadores.indexOf(lista_limpiadores.get(i)) + "-"
                        + lista_limpiadores.get(i)
                );
            }

        }

    }

    public static void VerNotificaciones() {

    }

    @Override
    public String toString() {
        return super.toString() + "\nlista de notificaciones : " + notificaciones_suciedad;
    }

}
