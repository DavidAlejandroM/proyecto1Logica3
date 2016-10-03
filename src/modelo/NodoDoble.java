
package modelo;

/**
 *
 * @author Yaqueline Hoyos Montes, Alejandro Marín Alzate
 * 
 */

public class NodoDoble 
{
    
    private Object dato;
    private NodoDoble li;
    private NodoDoble ld;
    
    /**
     * Método constructor de nodos
     * @param d 
     */
    public NodoDoble (Object d) 
    {
        dato = d;
        ld = null;
        li = null;
    }
    
    /**
     * Modifica el dato de un nodo
     * @param d 
     */
    public void setDato (Object d)
    {
        dato = d;
    }
    
    /**
     * Modifica la liga derecha del nodo
     * @param x 
     */
    public void setLd (NodoDoble x)
    {
        ld = x;
    }
    
    /**
     * Modifica la liga izquierda del nodo
     * @param x 
     */
    public void setLi (NodoDoble x)
    {
        li = x;
    }
    
    /**
     * Retorna el dato del nodo
     * @return 
     */
    public Object getDato ()
    {
        return dato;
    }
    
    /**
     * Retorna la liga izquierda del nodo
     * @return 
     */
    public NodoDoble getLi ()
    {
        return li;
    }
    
    /**
     * Retorna la liga derecha del nodo
     * @return 
     */
    public NodoDoble getLd()
    {
        return ld;
    }
    
}
