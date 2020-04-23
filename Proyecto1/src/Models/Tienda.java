package Models;

import java.util.ArrayList;

public class Tienda {
	private ArrayList<Juegos> juegos;
	private int vendidos;

	public Tienda(int vendidos) {
		super();
		this.juegos = new ArrayList<Juegos>();
		this.vendidos = vendidos;
	}

	public Tienda() {
	}

	public ArrayList<Juegos> getJuegos() {
		return juegos;
	}

	public void setJuegos(ArrayList<Juegos> juegos) {
		this.juegos = juegos;
	}

	public int getVendidos() {
		return vendidos;
	}

	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
	}

	@Override
	public String toString() {
		String juego1 = null;
		for (int i = 0; i < juegos.size(); i++) {
			if (i == 0) {
				juego1 = juegos.get(i).toString();
			} else {
				juego1 = juego1 + " , " + juegos.get(i).toString();
			}
		}

		return "Tienda [juegos=" + juego1 + ", vendidos=" + vendidos + "]";
	}
}
