package clases;

import java.util.HashMap;
import java.util.List;

public class Cliente {
	private String nombre;
	private HashMap<Tienda, List<Producto>> compras;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public HashMap<Tienda, List<Producto>> getCompras() {
		return compras;
	}
	public void setCompras(HashMap<Tienda, List<Producto>> compras) {
		this.compras = compras;
	}
	
	public static void comprarProducto() {
		
	}
	public double gastoTotal() {
		double gasto = 0;
		for (Producto producto : compras) {
			gasto = gasto + producto.getPrecio();
		}
	}
}
