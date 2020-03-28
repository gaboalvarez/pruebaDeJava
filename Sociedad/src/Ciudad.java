import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class Ciudad {
	List<Persona> habitantes = new ArrayList<>();
	/*Ciudad(List<Persona> habitantes){
		this.habitantes = habitantes;
	}*/
	void agregar(Persona habitanteNuevo) {
		habitantes.add(habitanteNuevo);
	}
	List<Persona> getHabitantes(){
		return habitantes;
	}
	void sacarA(Persona victima) {
		habitantes.remove(victima);
	}
	List<String> vivos(){
		List<Persona> tmp = habitantes.stream().filter(habitante -> habitante.getVida()==true).collect(Collectors.toList());
		return (tmp.stream().map(hab -> hab.getnombre()).collect(Collectors.toList()));
	}
}
