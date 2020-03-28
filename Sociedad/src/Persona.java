import java.util.List;

public class Persona {
	int edad;
	boolean conVida;
	String nombre;
	Persona(int edad, boolean conVida, String nombre){
		this.nombre = nombre;
		this.edad = edad;
		this.conVida = conVida;
	}
	boolean getVida() {
		return conVida;
	}
	void cumplirAnios() {
		edad += 1;
	}
	int getEdad() {
		return edad;
	}
	void matarA(List<Persona> ciudad, Persona victima) {
		if(ciudad.contains(victima)) {
			victima.conVida = false;
			ciudad.remove(victima);
			System.out.println(ciudad.size());
		}else {
			System.out.println("no encontró a la victima");
		}
	}
}
