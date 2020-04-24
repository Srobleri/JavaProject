package Operations;

import Models.Juegos;
import Models.Tienda;

public class Helpers {
	public static void vendido(Juegos juego,Tienda tienda) {
		juego.setCantidad(juego.getCantidad()-1);
		tienda.setVendidos(tienda.getVendidos()+1);
	} 
	
	public static void recomprar(Juegos juego, Tienda tienda ) {
		juego.setCantidad(juego.getCantidad()+1);
	}
}
