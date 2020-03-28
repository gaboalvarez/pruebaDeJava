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
	String getnombre() {
		return nombre;
	}
	void cumplirAnios() {
		edad += 1;
	}
	int getEdad() {
		return edad;
	}
	void matarA(Ciudad ciudad, Persona victima) {
		if((ciudad.getHabitantes()).contains(victima)) {
			victima.conVida = false;
			ciudad.sacarA(victima);
		}else {
			System.out.println("no encontró a la victima");
		}
	}
}
