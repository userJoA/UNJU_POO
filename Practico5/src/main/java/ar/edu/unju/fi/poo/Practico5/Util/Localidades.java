package ar.edu.unju.fi.poo.Practico5.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Localidades {

	public static List<String> listaCiudades= new ArrayList<String>(Arrays.asList("Ledesma","S.S De Jujuy","Perico","Palpala","La Quiaca","Tilcara"));
	
	public static String getCiudad(int num) {
		return listaCiudades.get(num);
	}
}
