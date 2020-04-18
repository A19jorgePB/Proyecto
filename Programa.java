import java.util.Calendar;

public class Programa {
	
	
	
	public String queHacerEnCasa(String dia) {
		switch (dia) {
		case "Lunes":
			return "Jugar al parchis";
		case "Martes":
			return "Jugar a las cartas";
		case "Jueves":
			return "Jugar al domino";
		case "Viernes":
			return "Ver una pelicula";
		case "Sabado":
			return "Ver una serie";
		case "Domingo":
			return "Ver partidos repetidos";
		default:
			return "Este dia no existe";
		}


	}

	public static void main(String[] args) {
		Programa p= new Programa ();
		//System.out.println(p.calculaElDoble(2));
	    	System.out.println(p.queHacerEnCasa("Lungsges"));

	}

}
