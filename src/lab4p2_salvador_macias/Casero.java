/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_salvador_macias;

import java.util.ArrayList;

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

    public static void desalojar() {

    }

    public static void despedir() {

    }

    public static void VerNotificaciones() {

    }

    @Override
    public String toString() {
        return super.toString() + "\nlista de notificaciones : " + notificaciones_suciedad;
    }

}
