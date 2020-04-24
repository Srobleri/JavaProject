package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import Operations.Helpers;
import Models.Juegos;
import Models.Tienda;

class Test {	
	@org.junit.jupiter.api.Test
	void testVendidos() {
		Tienda tienda=new Tienda();
		ArrayList<Juegos> juego=new ArrayList<Juegos>();
		juego.add(new Juegos("Juego1",2000,"plataforma1",10));
		tienda.setJuegos(juego);
		Helpers.vendido(tienda.getJuegos().get(0),tienda);
		assertEquals(9, juego.get(0).getCantidad());
		assertEquals(1, tienda.getVendidos());
	}
	
	@org.junit.jupiter.api.Test
	void testComprados() {
		Tienda tienda=new Tienda();
		ArrayList<Juegos> juego=new ArrayList<Juegos>();
		juego.add(new Juegos("Juego1",2000,"plataforma1",1));
		tienda.setJuegos(juego);
		Helpers.recomprar(juego.get(0), tienda);
		assertEquals(2, tienda.getJuegos().get(0).getCantidad());
	}
	
	

}
