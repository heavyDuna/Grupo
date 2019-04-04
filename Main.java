
public class Main {

	public static void main(String[] args) throws DemasiadasHoras {

		Grupo g1 = new Grupo("daw");

		g1.addAsignatura("programacion");
		// System.out.println(g1);

		Hora h1 = new Hora(8, 30);
		Hora h2 = new Hora(9, 25);
		Hora h3 = new Hora(9, 28);
		Hora h4 = new Hora(9, 30);

		try {
			g1.addHora("programacion", DiaSemana.L, h1);
			g1.addHora("programacion", DiaSemana.L, h2);
			g1.addHora("programacion", DiaSemana.L, h3);
			g1.addHora("programacion", DiaSemana.L, h4);
		} catch (DemasiadasHoras e) {

			System.out.println("DEMASIADAS HORASSS");
		}

		System.out.println(g1);
	}

}
