package ejercicios;

import java.util.List;
import java.util.Scanner;

import clases.Empleados;
import clases.Tienda;
import util.Funciones;
import util.FuncionesK;

public class menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		List<Empleados> listaEmpleados = reto.generaEmpleados();
		List<Tienda> listaTiendas =  reto.generaTienda(listaEmpleados);
		
		do {
			opcion = Funciones.dimeEntero("Introduce opci�n\n1.Ver tiendas\n2.Comprar\n3.Mostrar compras\n4.Realizar una queja\n5.Salir", sc);
			switch (opcion) {
			case 1:
				FuncionesK.mostrarTiendas(listaTiendas);
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
					
					break;
			default:
				System.out.println("Opci�n no v�lida");
				break;
			}
		} while (opcion!=5);

	}
	
	
	
	

}
