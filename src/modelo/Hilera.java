
package modelo;

/**
 *
 * @author Yaqueline Hoyos Montes, Alejandro Marín Alzate
 */
public class Hilera extends ListaDoblementeLigada
{
    private int longitud;
    private int longitudAux;

    public Hilera() 
    {
        super();
        longitud = 0;
    }
    
    public void insertarCaracter(char c)
    {
        NodoDoble n = new NodoDoble(c);
        insertarAlFinal(n);
        longitud = longitud + 1;
    }

    public int getTamaño() 
    {
        return longitud;
    }
    
    public NodoDoble getNodoI(int i)
    {
        NodoDoble p = this.primerNodo();
        for(int j = 1; j <= i; j++)
        {
            p = p.getLd();
        }
        return p;
    }
    
    public void modificar(char[] c)
    {
       for(int i = 0; i < longitud; i++)
       {
            NodoDoble x = this.getNodoI(i);
            x.setDato(c);
       }
    }
    
    public void eliminarNodo(NodoDoble x)
    {
        longitud--;
        this.desconectar(x);
    }
    
    public void invertir()
    {
        int i = 0;
        Hilera h = new Hilera();
        NodoDoble p = this.ultimo;
        NodoDoble q = this.primero;
        while (i < longitud)
        {
            h.insertarCaracter((char)p.getDato());
            p = p.getLi();
            i++;
        }
        i = 0;
        p = h.primero;
        while (i < longitud)
        {
            q.setDato(p.getDato());
            p = p.getLd();
            q = q.getLd();
            i++;
        }
    }
    
    public void ordenarAlfabeticamente()
    {
        int i = 0;
        ListaDoblementeLigada h = new ListaDoblementeLigada();
        NodoDoble p = this.primero;
        while(i < this.longitud)
        {
            NodoDoble pc = new NodoDoble(p.getDato());
            if (i == 0)
            {
                h.conectar(pc, null);
            }
            else
            {
                NodoDoble q = h.buscarDondeInsertar(pc.getDato());
                h.conectar(pc, q);
            }
            p = p.getLd();
            i++;
        }
        i = 0;
        p = h.primero;
        NodoDoble q = this.primero;
        while(i < this.longitud)
        {
            q.setDato(p.getDato());
            p = p.getLd();
            q = q.getLd();
            i++;
        }
    }
    
    public boolean esSubstring(Hilera h1)
    {
        boolean x = false;
        int i = 0;
        NodoDoble p = h1.primero;
        NodoDoble r = this.primero;
        if (this.longitud < h1.longitud)
        {
            while ((r != null) && (i < h1.longitud))
            {
                if (p.getDato() == r.getDato())
                {
                    p = p.getLd();
                    r = r.getLd();
                }
                else
                {
                    r = this.primero;
                    p = p.getLd();
                }
                i++;
            }
            if (r == null)
            {
                System.out.println("El this es subhilera de la nueva hilera");
                x = true;
            }
            else
            {
                System.out.println("No es subhilera");
            }
        }
        else if(this.longitud > h1.longitud)
        {
            while ((p != null) && (i < this.longitud))
            {
                if (p.getDato() == r.getDato())
                {
                    p = p.getLd();
                    r = r.getLd();
                }
                else
                {
                    p = h1.primero;
                    r = r.getLd();
                }
                i++;
            }
            if (p == null)
            {
                System.out.println("La nueva hilera es subhilera del this");
                x = true;
            }
            else
            {
                System.out.println("No es subhilera");
            }
        }
        else
        {
            while ((p != null) && (i < this.longitud) && (r != null))
            {
                if (p.getDato() == r.getDato())
                {
                    p = p.getLd();
                    r = r.getLd();
                }
                else
                {
                    System.out.println("No es subhilera");
                    x = false;
                }
                i++;
            }
            if (p == null && r == null)
            {
                System.out.println("Son iguales");
                x = true;
            }
            else
            {
                System.out.println("No es subhilera");
            }
        }
        return x;
    }

}
