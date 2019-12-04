package es.Studium.Operaciones3;

import java.util.Scanner;

public class Operaciones3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el primer número");
		a = teclado.nextInt();
		System.out.println("Introduzca el segundo número");
		b = teclado.nextInt();
		System.out.println("Introduzca el tercer número");
		c = teclado.nextInt();
		teclado.close();
		System.out.println( "La suma es " + FuncSuma(a,b,c));
		System.out.println( "La media es " + FuncMedia(a,b,c));
		System.out.println( "La multiplicacion es " + FuncMult(a,b,c));
	}
	public static double FuncMedia(int a, int b, int c)
	{
		return (double)FuncSuma(a,b,c)/(double)3;
	}
	public static int FuncSuma(int a, int b, int c)
	{
		return a+b+c;
	}
	public static int FuncMult(int a, int b, int c)
	{
		return a*b*c;
	}
}
