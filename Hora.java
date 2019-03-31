
public class Hora implements Comparable {

	private int hora;
	private int minuto;

	public Hora(int hora, int minuto) {

		this.hora = hora;
		this.minuto = minuto;
	}

	public Hora() {

		this.hora = 0;
		this.minuto = 0;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int compareTo(Object o) {
		Hora t = (Hora) o;

		if (this.hora > t.hora) {
			return 1;
		} else {

			if (this.hora < t.hora) {
				return -1;
			} else {

				if (this.minuto > t.minuto) {
					return 1;

				} else {

					if (this.minuto < t.minuto) {
						return -1;

					} else {

						return 0;
					}

				}
			}
		}
	}

	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minuto=" + minuto + "]";
	}

}
