/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_salvador_macias;

import java.util.ArrayList;
import static lab4p2_salvador_macias.Lab4p2_salvador_macias.lista_apartamentos;
import static lab4p2_salvador_macias.Lab4p2_salvador_macias.lista_inquilinos;

/**
 *
 * @author Apple
 */
public class Limpiador extends Persona {

    public boolean contratado = false;
    public ArrayList<Inquilino> lista_inquilinos_edificio = new ArrayList();
    public ArrayList solicitudes_limpieza = new ArrayList();

    public Limpiador(String nombre) {
        super(nombre);
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    public ArrayList<Inquilino> getLista_inquilinos_edificio() {
        return lista_inquilinos_edificio;
    }

    public void setLista_inquilinos_edificio(ArrayList<Inquilino> lista_inquilinos_edificio) {
        this.lista_inquilinos_edificio = lista_inquilinos_edificio;
    }

    public ArrayList getSolicitudes_limpieza() {
        return solicitudes_limpieza;
    }

    public void setSolicitudes_limpieza(ArrayList solicitudes_limpieza) {
        this.solicitudes_limpieza = solicitudes_limpieza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void ofrecerLimpieza(Edificio edificio_default) {
        if (lista_inquilinos.isEmpty()) {
            System.out.println("no hay inquilinos disponibles para ofrecer limpieza");
        } else {
            for (int i = 0; i < lista_inquilinos.size(); i++) {
                System.out.println(
                        lista_inquilinos.indexOf(lista_inquilinos.get(i)) + "-"
                        + lista_inquilinos.get(i)
                );
            }

        }

    }

    public static void LimpiarApartamento(Edificio edificio_default) {
        if (lista_apartamentos.isEmpty()) {
            System.out.println("no hay apartamentos o inquilinos para realizar limpieza");
        } else {
            for (int i = 0; i < lista_inquilinos.size(); i++) {
                System.out.println(
                        lista_inquilinos.indexOf(lista_inquilinos.get(i)) + "-"
                        + lista_inquilinos.get(i)
                );
            }

        }

    }
    

    @Override
    public String toString() {
        return super.toString() + "\nel limpiador esta contratado : " + contratado
                + "\n" + "lista de enquilinos: " + lista_inquilinos_edificio
                + "\n" + "solicitudes de limpieza: " + solicitudes_limpieza;
    }

}
