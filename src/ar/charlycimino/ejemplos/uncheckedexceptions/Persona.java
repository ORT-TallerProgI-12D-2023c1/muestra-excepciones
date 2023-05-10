package ar.charlycimino.ejemplos.uncheckedexceptions;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Persona {

    private int edad;

    public Persona(int edad) {
        setEdad(edad);
    }

    private void setEdad(int edad) /* throws IllegalArgumentException */ {
        Verificador.checkEsNegativo(edad);
        this.edad = edad;                
    }
}
