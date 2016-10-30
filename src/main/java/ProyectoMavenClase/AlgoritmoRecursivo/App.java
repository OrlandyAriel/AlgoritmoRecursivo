package ProyectoMavenClase.AlgoritmoRecursivo;

import java.util.ArrayList;

import ProyectoMavenClase.AlgoritmoRecursivo.Algoritmo.PuzzleSolve;
/**
 * @brief clase que contiene el método Main
 * @author Orlandy Ariel Sánchez A.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Character> u = new ArrayList<Character>();
    	u.add('a');
    	u.add('b');
    	u.add('c');
    	u.add('d');
    	
    	PuzzleSolve.puzzleSolverPDF(4, new ArrayList<Character>(), u);
    }
}
