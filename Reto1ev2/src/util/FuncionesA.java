package util;

import java.util.List;
import java.util.Scanner;

import clases.Tienda;

public class FuncionesA {
	public static Tienda eligeTienda(List<Tienda> listaTiendas, int numId) {
        Scanner sc = new Scanner(System.in);
        do {
            numId = Funciones.dimeEntero("Por favor introduzca el id de una tienda", sc);
            for (Tienda tienda : listaTiendas) {
                if (numId == tienda.getIdTienda()) {

                    return tienda;
                

                } else
                    System.out.println("Introduzca un id existente");

            }

        } while (true);

    }

}
