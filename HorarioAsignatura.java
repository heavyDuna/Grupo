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

	public void addHora(DiaSemana dia, Hora hora) {

		if (existeClave(dia)) {
			
			

		}

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

}
