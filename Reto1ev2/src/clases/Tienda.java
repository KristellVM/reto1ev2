package clases;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tienda {

	/*
	 * Cada tienda tendrá un identificador único, un nombre, un empleado que será el
	 * gerente y una lista de productos que tiene a la venta.
	 * 
	 * Los productos los podremos reponer y vender. Los productos tendrán un
	 * identificador y un nombre, ambos únicos, y un precio que estará entre 10 y
	 * 100 euros. Los productos se van a generar siempre con datos aleatorios.
	 */

	private int idTienda;
	private String nombreTienda;
	private Empleados empleado;
	private ArrayList<Producto> listaProductos;

	public Tienda() {
		this.listaProductos = new ArrayList<Producto>();
	}

	public Tienda(int idTienda, String nombreTienda, Empleados empleado) {
		super();
		this.idTienda = idTienda;
		this.nombreTienda = nombreTienda;
		this.empleado = empleado;
		this.listaProductos = new ArrayList<Producto>();

	}

	public int getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public Empleados getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return " [idTienda=" + idTienda + ", nombreTienda=" + nombreTienda + ", empleado=" + empleado
				+ ", listaProductos=" + listaProductos + "]";
	}

	
	
	
	
	
	
	
	public void eliminiarProducto(Producto producto) {

	

		listaProductos.remove(producto);

	}

	public void addProducto(Producto producto) {

		listaProductos.add(producto);

	}

	public void reponerProducto(Producto producto) {

		if (listaProductos.size() < 5) {
			for (int i = 0; i < 5; i++) {
				listaProductos.add(producto);
			}

		}

	}

	/*
	 * Al reponer productos le indicaremos cuántos productos queremos añadir a la
	 * lista de productos de esa tienda, se generarán nuevos productos que se
	 * añadirán a la lista de productos de esa tienda. Los productos también se van
	 * a vender y cuando se venda un producto se borrará de la lista de productos de
	 * esa tienda. Además, si al vender la tienda se queda con menos de 5 productos,
	 * repondrá 5 más automáticamente.
	 */

}
