package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import Operations.Helpers;
import Models.Juegos;
import Models.Tienda;

class Test {	
	@org.junit.jupiter.api.Test
	void testVendidos() {
		fail("Not yet implemented");
		Tienda tienda=new Tienda();
		ArrayList<Juegos> juego=new ArrayList<Juegos>();
		juego.add(new Juegos("Juego1",2000,"plataforma1",1));
		tienda.setJuegos(juego);
		Helpers.vendido(new Juegos("Juego1",2000,"plataforma1",1),tienda);
	}

}
