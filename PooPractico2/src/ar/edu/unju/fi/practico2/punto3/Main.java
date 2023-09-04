
package ar.edu.unju.fi.practico2.Punto3;

import java.util.Scanner;

public class Main {
	
    public static int substrings(String str) {
        //acumulador
    	long totalSuma = 0;
    	
        //inicia en el primer caracter del string y va iterando por todos
        for (int i = 0; i < str.length(); i++) {
        	   	
            long num = 0;
            
            for (int j = i; j < str.length(); j++) {
            	//se captura el substring , se resta por - '0' para transformar el caracter (str.charAt(j) - '0') en numero entero
            	//MOD 1000000007 para que no sea un numero muy grande
                num = (num * 10 + (str.charAt(j) - '0'))%1000000007;
                //descomentar para ver las subcadenas
               // System.out.println(num);
                
                //suma las subcadenas y con el MOD 1000000007 para que no sea un numero muy grande
                totalSuma = (totalSuma+num)%1000000007;
            }
        }

        return  (int) totalSuma;
    }

	public static void main(String[] args) {
		
		Scanner sca= new Scanner(System.in);
		System.out.print("Ingrese un Numero: ");
		String cadena=sca.next();
		int sumaDeCadenas=substrings(cadena);
		System.out.println("Suma de las subcadenas: "+sumaDeCadenas);
		
	}

}
