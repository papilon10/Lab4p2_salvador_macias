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
public class Apartamento {
     public ArrayList<Inquilino> lista_inquilinos = new ArrayList();
     public double precio;
     public int nivel_suciedad ;
     public boolean solicitud_limpieza = false;

    public Apartamento() {
    }

    public Apartamento(double precio, int nivel_suciedad) {
        this.precio = precio;
        this.nivel_suciedad = nivel_suciedad;
    }

    public ArrayList<Inquilino> getLista_inquilinos() {
        return lista_inquilinos;
    }

    public void setLista_inquilinos(ArrayList<Inquilino> lista_inquilinos) {
        this.lista_inquilinos = lista_inquilinos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNivel_suciedad() {
        return nivel_suciedad;
    }

    public void setNivel_suciedad(int nivel_suciedad) {
        this.nivel_suciedad = nivel_suciedad;
    }

    public boolean isSolicitud_limpieza() {
        return solicitud_limpieza;
    }

    public void setSolicitud_limpieza(boolean solicitud_limpieza) {
        this.solicitud_limpieza = solicitud_limpieza;
    }

    @Override
    public String toString() {
        return "lista de inquilinos : "+ lista_inquilinos
                +"\n" +"precio del apartamento: "+ precio
                +"\n" +"nivel de suciedad: "+ nivel_suciedad
                ;
    }
     
     
     
     
}
