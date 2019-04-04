import java.util.Arrays;

public class DemasiadasHoras extends Exception {

	private DiaSemana dia;
	private Hora hora;

	public DemasiadasHoras(DiaSemana dia, Hora hora) {

		super("Demasiadas horas");
		this.dia = dia;
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "dia=" + dia + ", hora=" + hora + ", mensaje=" + getMessage();
	}
	
	
	

	
}
