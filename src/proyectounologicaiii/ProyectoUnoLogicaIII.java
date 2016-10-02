/*
 * Yaqueline Hoyos Montes 1038407865
 * Alejandro Marín Alzate 1041325808
 */
package proyectounologicaiii;

/**
 *
 * @author Yaqueline Hoyos Montes, Alejandro Marín Alzate
 */
public class ProyectoUnoLogicaIII 
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
       Hilera a = new Hilera();
       a.insertarCaracter('a');
       a.insertarCaracter('m');
       a.insertarCaracter('o');       
       a.insertarCaracter('r');
       
       
       a.recorreIzqDer();/*
       NodoDoble y = a.primerNodo().getLd();
       a.eliminarNodo(a.getNodoI(2));
       a.recorreIzqDer();
       System.out.println(a.getTamaño());
       a.invertir();
       a.recorreIzqDer();.0
       System.out.println(a.getTamaño());
       a.ordenarAlfabeticamente();
       
       a.recorreIzqDer();
       System.out.println(a.getTamaño());
       Hilera b = new Hilera();
       b.insertarCaracter('r');
       b.insertarCaracter('h');
       b.insertarCaracter('o');
       b.insertarCaracter('l');       
       b.insertarCaracter('a');
       a.esSubstring(b);
       Hilera b = a.copiar();
       a.esPalindromo();*/
       Hilera b = new Hilera();
       b.insertarCaracter('r');
       b.insertarCaracter('o');
       b.insertarCaracter('m');
             
       a.esAnagrama(b);
    }
    
}
