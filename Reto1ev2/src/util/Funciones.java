package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Funciones {
	Scanner sc = new Scanner(System.in);
	
	public static double redondea(double d) {
		return Math.round(d*100)/(double)100;
	}
	
	public static void mostrarMapIntStrg(Map <Integer, String> map) {
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " - " +val);
		}
	}
	
	public static void mostrarMapStrg(Map <String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " - " +val);
		}
	}
	
	public static void mostrarListaInt(List<Integer> lista) {
		boolean primero = true;
		for (int i = 0; i < lista.size(); i++) {
			if(primero) {
				System.out.print(lista.get(i));
			primero = false;
			}
			else {
				System.out.print(", "+lista.get(i));
			}
		}
		System.out.println();
	}
	
	public static void mostrarListaString(List<String> lista) {
		boolean primero = true;
		for (int i = 0; i < lista.size(); i++) {
			if(primero) {
				System.out.print(lista.get(i));
			primero = false;
			}
			else {
				System.out.print(", "+lista.get(i));
			}
		}
		System.out.println();
	}
	
	public static void mostrarListaFecha(List<LocalDate> lista) {
		DateTimeFormatter horaEspaña = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		boolean primero = true;
		for (int i = 0; i < lista.size(); i++) {
			if(primero) {
				System.out.print(lista.get(i).format(horaEspaña));
			primero = false;
			}
			else {
				System.out.print(", "+lista.get(i).format(horaEspaña));
			}
		}
		System.out.println();
	}
	
	public static void mostrarArrayI(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i==0?array[i] : ", "+array[i]);
		}
		System.out.println();
	}
	
	public static void mostrarArrayS(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i==0?array[i] : ", "+array[i]);
		}
		System.out.println();
	}
	
	
	public static LocalDate dimeFecha(String texto,Scanner sc) {
		DateTimeFormatter horaEspaña = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try{
				System.out.println(texto);
				String fecha = sc.nextLine();
				LocalDate ldt= LocalDate.parse(fecha, horaEspaña);
				return ldt;
			}
			catch(Exception ex) {
				System.out.println("Fecha no válida");
			}
			
		}while(true);
		
	}
	
	public static boolean esInt(String s)
		{
			try {
				Integer.parseInt(s);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		
		//indica si el String que recibe como parÃ¡metro es decimal
		public static boolean esDouble(String s)
		{
			try {
				Double.parseDouble(s);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		
		//pide algo por consola hasta que sea un nÃºmero entero, el mensaje que pide ese algo se pasa
		//por parÃ¡metro para poder personalizarlo
		public static int dimeEntero(String orden, Scanner sc)
		{
			do
			{
			try {
				System.out.println(orden);
				String s = sc.nextLine();
				int n= Integer.parseInt(s);
				return n;

			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
			}while(true);
		}
		
		//pide algo por consola hasta que sea un nÃºmero decimal, el mensaje que pide ese algo se pasa
		//por parÃ¡metro para poder personalizarlo
		public static double dimeDouble(String orden, Scanner sc)
		{
			do
			{
			try {
				System.out.println(orden);
				String s = sc.nextLine();
				double d= Double.parseDouble(s);
				return d;

			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
			}while(true);
		}
		
		public static boolean esPrimo(int num1) {
			int cont=0;
			for(int i=2;i<num1;i++) {
				if(num1%i==0) {
					cont++;
				} 
			}
			if(cont==0) {
				return true;
			} else {
				return false;
			}
			
		}
	}

