/* 1. Declare una clase a su elección que contenga por los menos 3 atributos. Utilice
el IDE (por ejemplo, NetBeans) para crear el método constructor de la clase
creada anteriormente. La creación del método constructor puede hacerla
también de manera manual (escribiendo el código) si lo desea. Este constructor
debe recibir como parámetros los atributos del objeto a crear.
2. Cree un objeto a partir de dicha clase. Para declarar el objeto, puede hacerlo por
ejemplo en el método "main" principal que estará ubicado en otra clase (la clase
principal que contiene al método main).
3. Visualice los atributos del objeto creado mediante la sentencia:
System.out.println();
4. Aplique el Encapsulamiento, mediante el modificador "private" en los atributos, a
la clase creada en el punto 1. */

package Modulo1.C2.Ejercicios;

import java.util.Scanner;

public class Ejercicio_main {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		Cancion cancion = new Cancion();
		
		System.out.println("Ingrese titulo de la canción: ");
		cancion.setTitulo(leer.nextLine());
		
		System.out.println("Ingrese autor de la canción: ");
		cancion.setAutor(leer.nextLine());
		
		System.out.println("Ingrese album de la canción: ");
		cancion.setAlbum(leer.nextLine());
		
		
		System.out.println("");System.out.println("");System.out.println("");
		
		System.out.println("Título: " + cancion.getTitulo());
		System.out.println("Autor: " + cancion.getAutor());
		System.out.println("Album: " + cancion.getAlbum());
		
		
		leer.close();  //me pide eclipse que cierre el scanner sino me tira un warning no fatal

	}
	
}
