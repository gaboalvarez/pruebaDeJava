import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		List<Persona> ciudad = new ArrayList<>();
		Persona gabo = new Persona(22,true,"gabriel alvarez");
		Persona brandon = new Persona(21,true,"brandon cata");
		Persona meli = new Persona(20,true,"melisa clavel");
		ciudad.add(gabo);
		ciudad.add(brandon);
		System.out.println(ciudad.size());
		ciudad.add(meli);
		System.out.println(ciudad.size());
		gabo.matarA(ciudad,brandon);
	}

}
