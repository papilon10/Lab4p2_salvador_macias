/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_salvador_macias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Apple
 */
public class Lab4p2_salvador_macias {

    /**
     * @param args the command line arguments
     */
    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    public static ArrayList<Inquilino> lista_inquilinos = new ArrayList();
    public static ArrayList<Limpiador> lista_limpiadores = new ArrayList();

    public static Edificio edificio_default = new Edificio("Juan");

    public static void main(String[] args) {

        // TODO code application logic here
        boolean salida = false;
        do {
            System.out.println("---menu principal ---");
            System.out.println("1.menu de casero");
            System.out.println("2.menu de inquilino ");
            System.out.println("3.menu de limpiador");
            System.out.println("4.crear inquilino");
            System.out.println("5.crear limpiador");
            System.out.println("6.salir");
            System.out.println("seleccione una opcion: ");
            int opc = lea.nextInt();
            if (opc == 1) {
                menu_casero();
            } else if (opc == 2) {
                menu_inquilino();

            } else if (opc == 3) {
                menu_limpiador();
            } else if (opc == 4) {
            } else if (opc == 5) {
            } else if (opc == 6) {
                System.out.println("se abandonara el programa");
                salida = true;
            } else {
                System.out.println("opcion ingresada es invalida");
            }

        } while (salida
                != true);

    }//fin main

    public static void menu_casero() {
        boolean salida_casero = false;
        do {
            System.out.println("---menu casero---");
            System.out.println("1. desalojar departamento");
            System.out.println("2. despedir limpiadores");
            System.out.println("3. ver notificaciones ");
            System.out.println("4. volver al menu principal");
            System.out.println("seleccione una opcion: ");
            int opc_casero = lea.nextInt();
            switch (opc_casero) {
                case 1: {

                }

                break;
                case 2: {
                }

                break;
                case 3: {
                }

                break;
                case 4: {
                    System.out.println("volviendo al menu principal");
                    salida_casero = true;
                }

                break;

                default:
                    System.out.println("opcion ingresada es invalida");
            }

        } while (salida_casero != true);

    }//fin menu casero

    public static void menu_inquilino() {
        boolean salida_inquilino = false;
        do {
            for (int i = 0; i < lista_inquilinos.size(); i++) {
                System.out.println(
                        lista_inquilinos.indexOf(lista_inquilinos.get(i)) + "-"
                        + lista_inquilinos.get(i)
                );
            }
            System.out.println("seleccione inquilino: ");
            int inquilino_seleccionado = lea.nextInt();
            lista_inquilinos.get(inquilino_seleccionado);
            System.out.println("---menu inquilino---");
            System.out.println("1. firmar contraro");
            System.out.println("2. cortar contrato ");
            System.out.println("3. solitar limpieza ");
            System.out.println("4. aceptar limpieza");
            System.out.println("5.salir");

            System.out.println("seleccione una opcion: ");
            int opc_inquilino = lea.nextInt();
            switch (opc_inquilino) {
                case 1: {
                    menu_casero();

                }

                break;
                case 2: {

                }
                break;

                case 3: {
                }

                break;
                case 4: {
                }

                break;

                case 5: {
                    System.out.println("volviendo al menu principal");
                    salida_inquilino = true;
                }

                break;

                default:
                    System.out.println("opcion ingresada es invalida");
            }

        } while (salida_inquilino != true);

    }//fin menu inquilino

    public static void menu_limpiador() {
        boolean salida_limpiador = false;
        do {
            for (int i = 0; i < lista_limpiadores.size(); i++) {
                System.out.println(
                        lista_limpiadores.indexOf(lista_limpiadores.get(i)) + "-"
                        + lista_limpiadores.get(i)
                );
            }
            System.out.println("seleccione limpiador: ");
            int limpiador_seleccionado = lea.nextInt();
            lista_inquilinos.get(limpiador_seleccionado);
            System.out.println("---menu limpiador---");
            System.out.println("1. ofrecer limpieza");
            System.out.println("2. limpiar  apartamentos ");
            System.out.println("3.salir");

            System.out.println("seleccione una opcion: ");
            int opc_limpiador = lea.nextInt();
            switch (opc_limpiador) {
                case 1: {

                }

                break;
                case 2: {

                }
                break;

                case 3: {
                    salida_limpiador = true;
                    System.out.println("volviendo al menu principal");
                }

                break;

                default: {
                    System.out.println("opcion ingresada es invalida");

                }

            }
        } while (salida_limpiador != true);

    }//fin menu limpiador

}//fin clase
