/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_salvador_macias;

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

    public static void firmarContrato() {

    }

    public static void cortarContrato() {

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
