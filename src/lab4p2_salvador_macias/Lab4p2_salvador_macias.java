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
    public static ArrayList<Apartamento> lista_apartamentos = new ArrayList();

    public static Edificio edificio_default = new Edificio("Juan");

    public static void main(String[] args) {

        edificio_default.setLista_apartamentos(lista_apartamentos);
        edificio_default.setLista_limpiadores(lista_limpiadores);
        edificio_default.setLista_apartamentos(lista_apartamentos);

        lista_apartamentos.add(new Apartamento(200, 0));
        lista_apartamentos.add(new Apartamento(250, 0));
        lista_apartamentos.add(new Apartamento(500, 0));
        lista_apartamentos.add(new Apartamento(1000, 0));

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
                System.out.println("ingrese el nombre del inquilino : ");
                String nombre = str.nextLine();

//                if (lista_apartamentos.isEmpty()) {
//                    System.out.println("no hay apartamentos para designarle al inquilino");
//                } else {
//                    for (int i = 0; i < lista_apartamentos.size(); i++) {
//                        System.out.println(
//                                lista_apartamentos.indexOf(lista_apartamentos.get(i)) + "-"
//                                + lista_apartamentos.get(i)
//                        );
//                    }
//                    System.out.println("seleccion el apartamento a asignar : ");
//                    int apartamento_seleccionado = lea.nextInt();
//                    Apartamento seleccionado = lista_apartamentos.get(apartamento_seleccionado);
//                    lista_inquilinos.add(new Inquilino(seleccionado, nombre));
//
//                }
                lista_inquilinos.add(new Inquilino(nombre));

            } else if (opc == 5) {
                System.out.println("Ingrese el nombre del limpiador: ");
                String nombre = str.nextLine();
                boolean salida_agg = false;

                if (lista_inquilinos.isEmpty()) {
                    System.out.println("no hay inquilinos para asignar al limpiador ");

                } else {
                    System.out.println("ingrese el indice del inquilino a asignar");
                    do {
                        for (int i = 0; i < lista_inquilinos.size(); i++) {
                            System.out.println(
                                    lista_inquilinos.indexOf(lista_inquilinos.get(i)) + "-"
                                    + lista_inquilinos.get(i)
                            );
                        }
                        System.out.println("desea ingresar otro inquilino :"
                                + "\n1.si"
                                + "+\n0.no ");
                        int opc_agg_inq = lea.nextInt();
                        if (opc_agg_inq == 0) {
                            salida_agg = true;
                        }

                    } while (salida_agg != true);
                    lista_limpiadores.add(new Limpiador(nombre));

                }

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

                    Casero.desalojar(edificio_default);
                    for (int i = 0; i < lista_apartamentos.size(); i++) {
                        if (lista_apartamentos.get(i).getLista_inquilinos().isEmpty()) {
                            System.out.println("no hay inquilinos para desalojar");
                        } else {
                            System.out.println("ingrese el indice del departamento que desalojara: ");
                            int desalojado_depa = lea.nextInt();
                            lista_apartamentos.get(i).setLista_inquilinos(null);
                            System.out.println("el departamento fue desalojado");

                        }
                    }

                }

                break;
                case 2: {
                    Casero.despedir(edificio_default);
                    if (lista_limpiadores.isEmpty()) {
                        System.out.println("no hay limpiadores para despedir");
                    } else {
                        System.out.println("ingrese el indice del limpiador a despedir: ");
                        int indice_despedido = lea.nextInt();
                        lista_limpiadores.remove(indice_despedido);
                        System.out.println("se despedio al limpiador");

                    }

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

        if (lista_inquilinos.isEmpty()) {
            System.out.println("cree inquilino para seleccionar ");
        } else {

            for (int i = 0; i < lista_inquilinos.size(); i++) {
                System.out.println(
                        lista_inquilinos.indexOf(lista_inquilinos.get(i)) + "-"
                        + lista_inquilinos.get(i)
                );
            }
            System.out.println("seleccione inquilino: ");
            int inquilino_seleccionado = lea.nextInt();
            lista_inquilinos.get(inquilino_seleccionado);
            do {
                System.out.println("---menu inquilino---");
                System.out.println("1. firmar contrato");
                System.out.println("2. cortar contrato ");
                System.out.println("3. solicitar limpieza ");
                System.out.println("4. aceptar limpieza");
                System.out.println("5.salir");

                System.out.println("seleccione una opcion: ");
                int opc_inquilino = lea.nextInt();
                switch (opc_inquilino) {
                    case 1: {
                        Inquilino.firmarContrato(edificio_default, lista_inquilinos.get(inquilino_seleccionado));
                        System.out.println("Ingrese el indice del edificio que desea alquilar: ");
                        int depa_alquilado = lea.nextInt();
                        Apartamento depa_alqui = lista_apartamentos.get(depa_alquilado);
                        lista_inquilinos.get(inquilino_seleccionado).setApartamento(depa_alqui);

                    }

                    break;
                    case 2: {
                        Inquilino.cortarContrato(edificio_default, lista_inquilinos.get(inquilino_seleccionado));
                        System.out.println("se le ha rescendido el contrato del departamento al inquilino ");

                    }
                    break;

                    case 3: {
                        Inquilino.solicitarLimpieza(edificio_default);
                        System.out.println("Ingrese el indice del limpiador a la que se le desea hacer la solitud: ");
                        int limpiador_sele = lea.nextInt();
                        Limpiador selected = lista_limpiadores.get(limpiador_sele);

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
        }
    }//fin menu inquilino

    public static void menu_limpiador() {
        boolean salida_limpiador = false;
        if (lista_limpiadores.isEmpty()) {
            System.out.println("cree limpiador para seleccionar");
        } else {
            for (int i = 0; i < lista_limpiadores.size(); i++) {
                System.out.println(
                        lista_limpiadores.indexOf(lista_limpiadores.get(i)) + "-"
                        + lista_limpiadores.get(i)
                );
            }
            System.out.println("seleccione limpiador: ");
            int limpiador_seleccionado = lea.nextInt();
            lista_inquilinos.get(limpiador_seleccionado);

            do {

                System.out.println("---menu limpiador---");
                System.out.println("1. ofrecer limpieza");
                System.out.println("2. limpiar  apartamentos ");
                System.out.println("3.salir");

                System.out.println("seleccione una opcion: ");
                int opc_limpiador = lea.nextInt();
                switch (opc_limpiador) {
                    case 1: {
                        Limpiador.ofrecerLimpieza(edificio_default);
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
        }//fin else
    }//fin menu limpiador

}//fin clase
