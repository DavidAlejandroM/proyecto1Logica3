
package modelo;

/**
 *
 * @author Yaqueline Hoyos, Alejandro Marín
 * 
 */

public class ListaDoblementeLigada 
{
 
    protected NodoDoble primero;
    protected NodoDoble ultimo;
    
    public ListaDoblementeLigada () //Constructor
    {
        primero = null;
        ultimo = null;
    }
    
    /**
     * Retorna el primer nodo de la hilera
     * @return 
     */
    public NodoDoble primerNodo()
    {
        return primero;
    }
    
    /**
     * Retorna el último nodo de la hilera
     * @return 
     */
    public NodoDoble ultimoNodo()
    {
        return ultimo;
    }
    
    /**
     * Nos indica cuando el recorrido de la hilera llega al final
     * @param x
     * @return 
     */
    public boolean finDeRecorrido(NodoDoble x)
    {
        return x == null;
    }
    
    /**
     * Nos indica si la lista está vacía
     * @return 
     */
    public boolean esVacia()
    {
        return primero == null;
    }
    
    /**
     * Recorre e imprime la lista de izquierda a derecha
     */
    public void recorreIzqDer()
    {
        NodoDoble p;
        p = primerNodo();
        while (! finDeRecorrido(p))
        {
            System.out.println(p.getDato());
            p = p.getLd();
        }
    }
    
    /**
     * Recorre e imprime la lista de derecha a izquierda
     */
    public void recorreDerIzq()
    {
        NodoDoble p;
        p = ultimoNodo();
        while(! finDeRecorrido(p))
        {
            System.out.println(p.getDato());
            p = p.getLi();
        }
    }
    
    /**
     * Nos indica el nodo anterior a un nodo indicado
     * @param x
     * @return 
     */
    public NodoDoble anterior(NodoDoble x)
    {
        NodoDoble p;
        NodoDoble y;
        p = primerNodo();
        y = null;
        while (p != x)
        {
            y = p;
            p = p.getLd();
        }
        return y;
    }
    /**
     * conecta los nodos x, y
     * @param x despues de
     * @param y 
     */
    public void conectar(NodoDoble x, NodoDoble y)
    {
        if(y == null)
        {
            x.setLd(primero);
            if(primero != null)
            {
                primero.setLi(x);
            }
            else
            {
                ultimo = x;
            }
            primero = x;
        }
        else if(y.getLd() == null)
        {
            y.setLd(x);
            x.setLi(y);
            ultimo = x;
        }
        else
        {
            x.setLd(y.getLd());
            x.setLi(y);
            x.getLd().setLi(x);
            y.setLd(x);
        }
    }
    
    /**
     * Desconecta un nodo, indicando como parámetro el dato
     * @param x 
     */
    public void desconectar(NodoDoble x)
    {
        if (x.getLi() == null)
        {
            primero = x.getLd();
            if(primero == null)
            {
                ultimo = null;
            }
            else
            {
                primero.setLi(null);
            }
        }
        else if(x.getLd() == null)
        {
            ultimo = x.getLi();
            ultimo.setLd(null);
        }
        else
        {
            x.getLd().setLi(x.getLi());
            x.getLi().setLd(x.getLd());
        }
    }
    
    /*public void buscarDondeInsertar(Object d)
    {
    }*/
    
    /**
     * Inserta un nodo al final de la lista que como parámetro se igresa el dato
     * @param y 
     */
    public void insertarAlFinal(NodoDoble y)
    {
        if(primero == null)
        {
            primero = y;
            ultimo = y;
        }
        else
        {
            conectar(y, ultimo);
        }
    }
    
    /**
     * Busca en la lista un dato d
     * @param d
     * @return 
     */
    public NodoDoble buscarDato(Object d)
    {
        NodoDoble x;
        x = primerNodo();
        while ((! finDeRecorrido(x)) && (x.getDato() != d))
        {
            x = x.getLd();
        }
        return x;
    }
    
    /**
     * Desconecta un nodo que como parámetro le ingresamos el dato
     * @param x 
     */
    public void borrar(NodoDoble x)
    {
        if(x == null)
        {
            System.out.println("El dato a borrar no existe");
            return;
        }
        desconectar(x);
    }
    
    /**
     * Éste método se encarga de comparar el caracter si es menor o mayor a los datos que están ordenados alfabéticamente y busca dónde se debe insertar
     * @param d
     * @return 
     */
    public NodoDoble buscarDondeInsertar(Object d)
    {
        
        NodoDoble p;
        NodoDoble y;
        p = primerNodo();
        y = anterior(p);
        Character dato = (Character)p.getDato();
        Character dato2 = (Character)d;
        
        while( (dato < dato2) &&  ! finDeRecorrido(p))
        {
            y = p;
            p = p.getLd();
            if(p !=null)
            {
               dato = (Character)p.getDato(); 
            }
            
        }
        return y;
    }


    
    
}
