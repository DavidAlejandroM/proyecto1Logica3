
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
    
    public NodoDoble (Object d) //Constructor
    {
        dato = d;
        ld = null;
        li = null;
    }
    
    public void setDato (Object d)
    {
        dato = d;
    }
    
    public void setLd (NodoDoble x)
    {
        ld = x;
    }
    
    public void setLi (NodoDoble x)
    {
        li = x;
    }
    
    public Object getDato ()
    {
        return dato;
    }
    
    public NodoDoble getLi ()
    {
        return li;
    }
    
    public NodoDoble getLd()
    {
        return ld;
    }
    
}
