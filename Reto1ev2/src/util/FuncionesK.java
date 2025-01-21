package util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import clases.Producto;
import clases.Tienda;

public class FuncionesK {
	public static void mostrarTiendas(List<Tienda> tiendas) {
		for (Tienda tienda : tiendas) {
			System.out.println(tienda.getIdTienda()+" - "+tienda.getNombreTienda()+", Gerente: "+tienda.getEmpleado().getNombre()+ ", productos en venta: "+tienda.getListaProductos().size());
		}
	}
	
	public static void mostrarCompras(HashMap<Tienda, List<Producto>> compras) {
		for (Map.Entry<Tienda, List<Producto>> entry : compras.entrySet()) {
			Tienda key = entry.getKey();
			List<Producto> val = entry.getValue();
			System.out.println(key.getNombreTienda());
			for (Producto producto : val) {
				System.out.println();
			}
		}
	}
}