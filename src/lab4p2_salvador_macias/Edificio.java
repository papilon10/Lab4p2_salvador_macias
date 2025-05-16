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
public class Edificio {

    public String dueno;
    public ArrayList<Apartamento> lista_apartamentos = new ArrayList();
    public ArrayList<Limpiador> lista_limpiadores = new ArrayList();

    public Edificio() {
    }

    public Edificio(String dueno) {
        this.dueno = dueno;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public ArrayList<Apartamento> getLista_apartamentos() {
        return lista_apartamentos;
    }

    public void setLista_apartamentos(ArrayList<Apartamento> lista_apartamentos) {
        this.lista_apartamentos = lista_apartamentos;
    }

    public ArrayList<Limpiador> getLista_limpiadores() {
        return lista_limpiadores;
    }

    public void setLista_limpiadores(ArrayList<Limpiador> lista_limpiadores) {
        this.lista_limpiadores = lista_limpiadores;
    }

    @Override
    public String toString() {
        return "nombre del dueno del edificio: " + dueno
                + "\n" + "lista de apartamentos: " + lista_apartamentos
                + "\n" + "lista de limpiadores: " + lista_limpiadores;
    }

}
