package Models;

public class Juegos {
	private String titulo;
	private int salida;
	private String plataforma;
	private int cantidad;

	public Juegos(String titulo, int salida, String plataforma, int cantidad) {
		super();
		this.titulo = titulo;
		this.salida = salida;
		this.plataforma = plataforma;
		this.cantidad = cantidad;
	}

	public Juegos() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getSalida() {
		return salida;
	}

	public void setSalida(int salida) {
		this.salida = salida;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Juegos [titulo=" + titulo + ", salida=" + salida + ", plataforma=" + plataforma + ", cantidad="
				+ cantidad + "]";
	}

}
