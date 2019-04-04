import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Grupo {

	private String nombre;
	private SortedMap asignaturas;

	public Grupo(String nombre) {

		this.asignaturas = new TreeMap();
		this.nombre = nombre;

	}

	public Grupo(String nombre, Comparator c) {

		this.asignaturas = new TreeMap(c);
		this.nombre = nombre;

	}
	
	public void addAsignatura (String nombreAsignatura) {
		
		this.asignaturas.put(nombreAsignatura, new HorarioAsignatura());
	}

	public void addHora(String nombreAsignatura, DiaSemana dia, Hora hora) throws DemasiadasHoras {

		HorarioAsignatura horario;

		horario = (HorarioAsignatura) this.asignaturas.get(nombreAsignatura); ///al hacer get de nombreAsignatura nos devulve el horario entero
		horario.addHoraAsignatura(dia, hora);

	}

	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", asignaturas=" + asignaturas + "]";
	}
	
	

}
