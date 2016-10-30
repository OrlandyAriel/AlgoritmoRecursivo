package ProyectoMavenClase.AlgoritmoRecursivo.Algoritmo;

import java.util.ArrayList;
/**
 * \class PuzzleSolve
 * \brief Clase que realiza combinaciones sin repeticón de una cadena de texto
 * 
 * El algoritmo utilizado en esta práctica no es de mi propiedad, es sacado del
 * pseudocodigo sacado de un libro de estrura de datos, el cual fue facilitado por
 * el profesor de la asignatura
 * \author Orlandy Ariel Sánchez A.
 */
public class PuzzleSolve
{
	/**
	 * \brief constructor privado para evitar que se instancien objetos de este tipo de clase.
	 */
	private PuzzleSolve()
	{
	}
	/**
	 * \brief puzzleSolverPDF es un método recursivo para resolver un puzle
	 * 
	 * 	Método encargado de realizar las combinaciones de todas las letras recursivamente
	 * \param k: Tamaño de la lista
	 * \param s: Lista de entrada
	 * \param u: Lista de salida
	 */
	public static void puzzleSolverPDF(Integer k, ArrayList<Character> s, ArrayList<Character> u)
	{
		for (int i = 0; i <k ; i++)
		{
			Character aCarAux = u.get(i);
			s.add(aCarAux);
			u.remove(i);
			if (k == 1)
			{
				System.out.println(s.toString());/// System.out.println(s.toString());  Muestra por consola la solución encontrada
			} else
			{
				puzzleSolverPDF(k - 1, s, u);
			}
			u.add(i,s.get(s.size()-1)); /// u.add(i,s.get(s.size()-1)); Añade la ultima posición valida de s a u 
			s.remove(s.size()-1);
		}
	}
}
