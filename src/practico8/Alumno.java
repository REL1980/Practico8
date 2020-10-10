package practico8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Alumno 
{
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> lista = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) 
    {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() 
    {
        return legajo;
    }
    public void setLegajo(int legajo) 
    {
        this.legajo = legajo;
    }

    public String getApellido() 
    {
        return apellido;
    }
    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public HashSet<Materia> getLista() 
    {
        return lista;
    }
    public void setlista(HashSet<Materia> lista) 
    {
        this.lista = lista;
    }
    
    public void agregarMateria(Materia materia)
    {
        if(lista.add(materia))
        {
            System.out.println("Materia agregada");
        }
        else
        {
            System.out.println("Materia Duplicada");
        }
    }
    
    public int cantidadMaterias()
    {
        int cant=0;
        for(Materia it : lista)
        {
            cant++;
        }
        
        return cant;
    }
    
    
}
