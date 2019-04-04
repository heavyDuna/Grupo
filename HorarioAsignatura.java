import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class HorarioAsignatura {

	private SortedMap horarioAsignatura;
	// private Set horas;

	public HorarioAsignatura() {

		this.horarioAsignatura = new TreeMap();
		this.horarioAsignatura.put(DiaSemana.L, new TreeSet());
		this.horarioAsignatura.put(DiaSemana.M, new TreeSet());
		this.horarioAsignatura.put(DiaSemana.X, new TreeSet());
		this.horarioAsignatura.put(DiaSemana.J, new TreeSet());
		this.horarioAsignatura.put(DiaSemana.V, new TreeSet());
		// this.horas= new TreeSet();

	}

	public void add(DiaSemana dia, TreeSet horas) {

		this.horarioAsignatura.put(dia, horas);

	}

	/*
	 * public boolean addHora(DiaSemana dia, Hora hora) { //tratando la excepcion
	 * aqui
	 * 
	 * //if (existeClave(dia)) {
	 * 
	 * int numeroHoras; TreeSet t; t = (TreeSet) this.horarioAsignatura.get(dia);
	 * 
	 * numeroHoras = t.size();
	 * 
	 * try { if (numeroHoras == 3) { throw new DemasiadasHoras();
	 * 
	 * } } catch (DemasiadasHoras e) { return false; } t.add(hora); return true; //
	 * }
	 * 
	 * }
	 */

	public void addHoraAsignatura(DiaSemana dia, Hora hora) throws DemasiadasHoras {

		if (existeClave(dia)) {

			int numeroHoras;
			TreeSet t;
			t = (TreeSet) this.horarioAsignatura.get(dia); // al hacer get de dia nos devulve el treeset de horas de ese
															// dia

			numeroHoras = t.size();

			if (numeroHoras == 3) {
				throw new DemasiadasHoras(dia, hora);

			}

			t.add(hora);

		}

	}

	public int contarHoras(DiaSemana dia) {

		TreeSet t;
		t = (TreeSet) this.horarioAsignatura.get(dia);
		int cont = 0;

		Iterator it = t.iterator();
		while (it.hasNext()) {

			cont++;

		}

		return cont;

	}

	public boolean existeClave(DiaSemana dia) {

		boolean existe = false;
		Set s = this.horarioAsignatura.keySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {
			if (it.next().equals(dia)) {
				existe = true;
			}

		}
		return existe;

	}

	@Override
	public String toString() {
		return "Horario: " + horarioAsignatura + "]";
	}

}
