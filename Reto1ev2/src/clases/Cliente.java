package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Cliente {
	private String nombre;
	private HashMap<Tienda, List<Producto>> compras;
	
	public Cliente() {
		this.compras = new HashMap<Tienda, List<Producto>>();
	}
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.compras = new HashMap<Tienda, List<Producto>>();
	}
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
	
	public  void comprarProducto(Tienda tienda, Producto producto) {
		compras.putIfAbsent(tienda, new ArrayList<Producto>());
		compras.get(tienda).add(producto);
	}
	public double gastoTotal() {
		double gasto = 0;
		
		for (Entry<Tienda, List<Producto>> compras : compras.entrySet()) {
			Tienda key = compras.getKey();
			List<Producto> val = compras.getValue();
			for (Producto producto : val) {
				gasto = gasto + producto.getPrecio();
			}
		}
		return gasto;
	}
}
