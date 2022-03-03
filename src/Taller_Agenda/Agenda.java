package Taller_Agenda;

import java.security.KeyStore.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Agenda {
	static Scanner numeros = new Scanner(System.in);
	static Scanner cadenas = new Scanner(System.in);

//declarar objero coleccion agenda
	static TreeMap<String, Contacto> miAgenda = new TreeMap<>();

	public static void main(String[] args) {

		short opcion = -1;

		// menu

		do {

			System.out.println("Pulsa la opcion que quieras realizar:");
			System.out.println("1: Nuevo contacto");
			System.out.println("2. Buscar contacto");
			System.out.println("3. Mostrar agenda");
			System.out.println("3. Eliminar contacto");
			System.out.println("0 Para salir del programa.");
			
			
			opcion = numeros.nextShort();
			
			System.out.println("Pulsa la opcion que quieras realizar");

			switch (opcion) {

			case 1:
				System.out.println("1. Nuevo contacto");
				nuevoContacto();
				break;

			case 2:
				System.out.println("2. Buscar");
				buscarContacto();
				break;

			case 3:

				System.out.println("3. Mostrar agenda");
				inicializaAgenda();
				mostrarAgenda();
				
				break;

			case 4:
				System.out.println("4. Eliminar contacto");
				eliminarContacto();

				break;

			case 0:
				System.out.println("0. Para salir del programa.");
				break;

			default:
				System.out.println("Opcion incorrecta, vuelve a intentarlo");
				break;

			}

		} while (opcion != 0);

	}

	private static void inicializaAgenda() {
		miAgenda.put("Sergio", new Contacto("Sergio", "1231249", "xexas@gmail.com"));
		miAgenda.put("Julian", new Contacto("Julian", "78678685", "asd@gmail.com"));
		miAgenda.put("Ana", new Contacto("Ana", "2345234", "poasd@gmail.com"));

	}

	private static void nuevoContacto() {
		Contacto nuevo = new Contacto();

		System.out.println("Escribe un nombre: ");
		nuevo.setNombre(cadenas.nextLine());

		System.out.println("Escribe un telefono: ");
		nuevo.setTelefono(cadenas.nextLine());

		System.out.println("Escribe un email: ");
		nuevo.setEmail(cadenas.nextLine());

		miAgenda.put(nuevo.getNombre(), nuevo);

	}

	private static void mostrarAgenda() {

		for (java.util.Map.Entry<String, Contacto> entry : miAgenda.entrySet()) {
		    //String key = entry.getKey();
		    //Contacto val = entry.getValue();
			System.out.println(entry);
		}
	}
	private static void buscarContacto() {
		
		
	}
private static void eliminarContacto() {
		
	}

}
