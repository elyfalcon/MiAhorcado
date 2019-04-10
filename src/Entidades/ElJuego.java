
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Eli
 */


public class ElJuego {
    
private Diccionario completo;
private Diccionario pornivel;
private Palabras laelegida;
protected int contadorFallos;
protected int contadorAciertos;
protected ArrayList<Character> palabraOculta;
protected ArrayList<Character> letrasUsadas;
protected char letraElegida;
    
    
    

    public ElJuego() {
    }
    
    public ElJuego( int nivel)
    {
    this.completo=Diccionario.cargarDiccionario(miahorcado.MiAhorcado.archivo);
    this.pornivel=completo.FiltradoPorNivel(nivel);
    this.laelegida=this.pornivel.elegirPalabraAleatoria();
    this.palabraOculta=new ArrayList<>();
    
    }

    public Diccionario getCompleto() {
        return completo;
    }

    public Palabras getLaelegida() {
        return laelegida;
    }

    public int getContadorFallos() {
        return contadorFallos;
    }

    public int getContadorAciertos() {
        return contadorAciertos;
    }
    

    public void setPalabraOculta(ArrayList<Character> palabraOculta) {
        this.palabraOculta = palabraOculta;
    }
    
    
    
}
