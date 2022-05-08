package main;

public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona();
		
		persona.setEdad(25);
		persona.setNombre("Diego");
		persona.setTelefono(999992221);
		
		System.out.println(
				"Edad: " + persona.getEdad() + 
				" | Nombre: " + persona.getNombre() + 
				" | telf: " + persona.getTelefono() 
		);
	}

}
