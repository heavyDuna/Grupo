import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Grupo {

	private String nombre;
	private SortedMap asignaturas;

	/*
	 * public Grupo(String nombre) {
	 * 
	 * this.asignaturas = new TreeMap(); this.nombre = nombre;
	 * 
	 * }
	 */

	/*
	 * public Grupo(String nombre, SortedMap asignaturas) {
	 * 
	 * this.asignaturas = asignaturas;; this.nombre = nombre;
	 * 
	 * }
	 */

	public Grupo(String nombre, Comparator c) {

		this.asignaturas = new TreeMap(c);
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public SortedMap getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(SortedMap asignaturas) {
		this.asignaturas = asignaturas;
	}

	public void add(String nombreAsignatura, HorarioAsignatura horario) {

		this.asignaturas.put(nombreAsignatura, horario);

	}

	public void addHora(String nombreAsignatura, HorarioAsignatura horario, DiaSemana dia) {
 

	}

}
