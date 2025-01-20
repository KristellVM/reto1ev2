package clases;

public class Empleados {
	/*
	 * Cada empleado tendrá un nombre, antigüedad y sueldo.
	 * 
	 * El sueldo no se pasará como argumento a ningún constructor,
	 * 
	 * 
	 * y se establecerá conforme al valor de la antigüedad: si el empleado tiene
	 * menos de 5 años de antigüedad, cobrará 1000 euros, entre 6 y 10 años de
	 * antigüedad 1200 euros y si tiene más de 10 años 1500 euros. 
	 * 
	 * Si le cambiamos la antigüedad a un empleado el sueldo deberá actualizarse.
	 */

	// atributos
	private String nombre;
	private int antiguedad;
	private double sueldo;

	// constructor vacío

	public Empleados() {
		super();
	}

	// constructor lleno
	public Empleados(String nombre, int antiguedad) {// no pasar sueldo
		super();
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		calculaSueldo();//calculo el sueldo
		//si mi metodo calcular sueldo  fuera double, tendria q haber puesto--> this.sueldo

	}
	// get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
		calculaSueldo();//si cambio la antigüedad, cambio el sueldo
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	// metodo calcular sueldo
	public void calculaSueldo() {// como es void*
		double suedo = 0;
		if (antiguedad < 5) {
			suedo = 1000;
		}
		else if (antiguedad > 6 && antiguedad < 10) {
			suedo = 1200;
		} else if (antiguedad > 10) {
			suedo = 1500;
		}
	}
	
}
