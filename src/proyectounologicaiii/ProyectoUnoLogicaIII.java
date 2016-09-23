/*
 * Yaqueline Hoyos Montes 1038407865
 * Alejandro Marín Alzate
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
       a.insertarCaracter('b');
       a.insertarCaracter('c');
       a.insertarCaracter('d');
       a.recorreIzqDer();
       NodoDoble y = a.primerNodo().getLd();
       a.eliminarNodo(a.getNodoI(2));
       a.recorreIzqDer();
       System.out.println(a.getTamaño());
       a.invertir();
       a.recorreIzqDer();
    }
    
}
