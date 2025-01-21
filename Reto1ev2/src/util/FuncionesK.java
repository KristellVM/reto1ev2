package util;

import java.util.List;

import clases.Tienda;

public class FuncionesK {
	public static void mostrarTiendas(List<Tienda> tiendas) {
		for (Tienda tienda : tiendas) {
			System.out.println(tienda.getIdTienda()+" - "+tienda.getNombreTienda()+", Gerente: "+tienda.getEmpleado().getNombre()+ ", productos en venta: "+tienda.getListaProductos().size());
		}
	}
}
