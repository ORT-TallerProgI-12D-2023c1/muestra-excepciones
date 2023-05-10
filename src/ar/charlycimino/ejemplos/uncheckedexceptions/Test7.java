
package ar.charlycimino.ejemplos.uncheckedexceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test7 {

    /*
      Interpretar el 'call stack'
    */
    public static void main(String[] args) {
    	try {
    		int datoObtenidoDeLaBaseDeDatos = -1;
    		Persona p = new Persona(datoObtenidoDeLaBaseDeDatos);
    	} catch(Exception e) {
    		// Retornado un status 500 de http con un mensaje
    		// Mostrar un carte del error con el mensaje
    		// JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR FATAL", JOptionPane.ERROR_MESSAGE);
    		System.out.println(e.getMessage());
    	}        
    }

}
