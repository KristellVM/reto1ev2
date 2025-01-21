package clases;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tienda {

	/*
	 * Cada tienda tendrá un identificador único, un nombre, un empleado que será el
	 * gerente y una lista de productos que tiene a la venta.
	 * 
	 *  Los productos los
	 * podremos reponer y vender. Los productos tendrán un identificador y un
	 * nombre, ambos únicos, y un precio que estará entre 10 y 100 euros. Los
	 * productos se van a generar siempre con datos aleatorios.
	 */

	private int idTienda;
<<<<<<< HEAD
	private String nombreTienda, empleado;
	private ArrayList<Producto> listaProductos;
=======
	private String nombreTienda;
	private Empleados empleado;
	private ArrayList<String> listaProductos;
>>>>>>> branch 'main' of https://github.com/KristellVM/reto1ev2.git

	public Tienda() {
		super();
	}
	
	public Tienda(int idTienda, String nombreTienda, Empleados empleado) {
		super();
		this.idTienda = idTienda;
		this.nombreTienda = nombreTienda;
		this.empleado = empleado;
	}
	

<<<<<<< HEAD
	public Tienda(int idTienda, String nombreTienda, String empleado, ArrayList<Producto> listaProductos) {
=======
	public Tienda(int idTienda, String nombreTienda, Empleados empleado, ArrayList<String> listaProductos) {
>>>>>>> branch 'main' of https://github.com/KristellVM/reto1ev2.git
		super();
		this.idTienda = idTienda;
		this.nombreTienda = nombreTienda;
		this.empleado = empleado;
		this.listaProductos = listaProductos;
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
	
	
	public void (ArrayList<Producto> productos) {
	
		ArrayList <Producto> productoDisponible = new ArrayList<>();
		
for (int i = 0; i < productoDisponible.size(); i++) {
	
	
	if(i == productoDisponible.size()) {
		
		
		productos.remove(i);
		
		
	}
	
}	
} 
	
}	
	
	
	
<<<<<<< HEAD
=======
	
}




	

	
	

>>>>>>> branch 'main' of https://github.com/KristellVM/reto1ev2.git

<<<<<<< HEAD
=======
}


>>>>>>> branch 'main' of https://github.com/KristellVM/reto1ev2.git
