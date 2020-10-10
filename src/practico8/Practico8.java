package practico8;

public class Practico8 
{
    
    public static void main(String[] args) 
    {
        Materia ingles1 = new Materia(110,"Ingles I",1);
        Materia mate = new Materia(111,"Matematicas I",1);
        Materia lab1 = new Materia(112,"Laboratorio I",1);
        
        Alumno martin = new Alumno(1001,"Lopez","Martin");
        Alumno brenda = new Alumno(1002,"Martinez","Brenda");
        
        martin.agregarMateria(ingles1);
        martin.agregarMateria(mate);
        martin.agregarMateria(lab1);
        
        brenda.agregarMateria(ingles1);
        brenda.agregarMateria(mate);
        brenda.agregarMateria(lab1);
        brenda.agregarMateria(lab1);
        
        System.out.println(martin.getApellido()+" se inscribió en: "+martin.cantidadMaterias()+" materias");
        System.out.println(brenda.getApellido()+" se inscribió en: "+brenda.cantidadMaterias()+" materias");
    }
    
}
