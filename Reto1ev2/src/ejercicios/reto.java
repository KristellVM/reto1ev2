package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import clases.Empleados;
import clases.Tienda;

public class reto {

	public static void main(String[] args) {
		/*
		 * Genera 20 empleados, cada uno con datos aleatorios, y antigüedad entre 1 y 20 años
		 * 
		 *  
		 * 5 tiendas con datos aleatorios, 
		 * el identificador que no se repita, y
		 * asignarle un empleado que cojáis de la lista de empleados. El empleado puede
		 * ser generte en dos tiendas o más, no hay que validarlo. Llamar al método
		 * reponer de la tienda para añadir entre 5 a 10 productos.  1 cliente con
		 * datos aleatorios
		 */
		
		// creo 21 empleados
			List<Empleados> listaEmpleados = generaEmpleados();
			
			
			System.out.println(listaEmpleados);
			List<Tienda> listaTiendas = generaTienda();
		System.out.println(listaTiendas);
	}
	//lista de empleados
	public static List<Empleados> generaEmpleados() {
			List<Empleados> listaEmpleados = new ArrayList<Empleados>();
			Random r = new Random();
			for (int i = 1; i < 21; i++) {
				// crear 10 empleados
				Empleados e = new Empleados("empleado" + i, r.nextInt(1, 21));//nombre, antiguedad
				// añado a  lista
				listaEmpleados.add(e);
			}
			return listaEmpleados;
		}
	//lista de tiendas
	public static List<Tienda> generaTienda(List<Empleados> Empleado) {
		List<Tienda> listaTiendas = new ArrayList<Tienda>();
		Random r = new Random();
		for (int i = 1; i < 6; i++) {
			// crear 5empleados
			Tienda t = new Tienda(r.nextInt(1, 20),"tienda" + i,r.nextInt(1,21));//int idTienda, String nombreTienda, String empleado, ArrayList<String> listaProductos
			// añado a  lista
			listaTiendas.add(t);
		}
		return listaTiendas;
	}
	
}
