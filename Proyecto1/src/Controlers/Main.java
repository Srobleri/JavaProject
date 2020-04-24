package Controlers;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Juegos;
import Models.Tienda;
import Operations.Helpers;

public class Main {
	static Tienda tienda = new Tienda();
	static ArrayList<Juegos> juegos = new ArrayList<Juegos>();
	static int select;

	public static void main(String[] args) {
		do {
			menuPrincipal();
		} while (select != 0);
	}

	public static void menuPrincipal() {
		System.out.println("1.- Añadir juegos por defecto al registro\n" + "2.- Vender juego\n" + "3.- Ver datos\n" + "0.- Salir\n"
				+ "Elija entre las opciones:");
		Scanner src = new Scanner(System.in);
		select = src.nextInt();
		switch (select) {
		case 1:
			juegos.add(new Juegos("Mario Bros", 1997, "GameCube", 100));
			juegos.add(new Juegos("Sonic", 1998, "MegaDrive", 100));
			tienda.setJuegos(juegos);
			break;

		case 2:
			Helpers.vendido(juegos.get(menuSecundario()), tienda);
			break;
		case 3:
			System.out.println(tienda.toString());
			break;
		case 0:
			System.out.println("Adios");
		default:
			System.out.println("Error, elige entre las opciones");

		}
	}

	public static int menuSecundario() {
		do {
			System.out.println("Elije uno de estos juegos:\n" + "1.- Mario Bros\n" + "2.- Sonic");
			Scanner src = new Scanner(System.in);
			select = src.nextInt();
			if (select != 1 && select != 2) {
				System.out.println("Elija entre las opciones");
			}
		} while (select != 1 && select != 2);
		return select - 1;
	}
}
