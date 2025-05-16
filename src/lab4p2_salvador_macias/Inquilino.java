/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_salvador_macias;

import static lab4p2_salvador_macias.Lab4p2_salvador_macias.lista_apartamentos;

/**
 *
 * @author Apple
 */
public class Inquilino extends Persona {
    
    Apartamento apartamento;
    boolean estado_contrato = false;
    
    public Inquilino(Apartamento apartamento, String nombre) {
        super(nombre);
        this.apartamento = apartamento;
    }
    
    public Apartamento getApartamento() {
        return apartamento;
    }
    
    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }
    
    public boolean isEstado_contrato() {
        return estado_contrato;
    }
    
    public void setEstado_contrato(boolean estado_contrato) {
        this.estado_contrato = estado_contrato;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static void firmarContrato(Edificio edificio_default, Inquilino inquilino) {
        if (lista_apartamentos.isEmpty()) {
            System.out.println("no hay apartamentos disponibles");
        } else {
            for (int i = 0; i < lista_apartamentos.size(); i++) {
                System.out.println(
                        lista_apartamentos.indexOf(lista_apartamentos.get(i)) + "-"
                        + lista_apartamentos.get(i)
                );
            }
            
        }
        inquilino.setEstado_contrato(true);
        
    }
    
    public static void cortarContrato(Edificio edificio_default, Inquilino inquilino) {
        inquilino.estado_contrato = false;
        inquilino.setApartamento(null);
        
    }
    
    public static void solitarLimpieza() {
        
    }
    
    public static void aceptarLimpieza() {
        
    }
    
    @Override
    public String toString() {
        return super.toString() + "\napartamento asignado : " + apartamento
                + "\ntiene un contrato activo? " + estado_contrato;
    }
    
}
