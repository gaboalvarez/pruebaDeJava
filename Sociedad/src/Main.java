import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Persona gabo = new Persona(22,true,"gabriel alvarez");
		Persona brandon = new Persona(21,true,"brandon cata");
		Persona meli = new Persona(20,true,"melisa clavel");
		Ciudad bsas = new Ciudad();
		bsas.agregar(gabo);
		bsas.agregar(brandon);
		bsas.agregar(meli);
		System.out.println(bsas.vivos());
		gabo.matarA(bsas,brandon);
		System.out.println(bsas.vivos());
		
	}

}
