
/**
 * Write a description of class TestPerosnaPila here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPerosnaPila
{
    public static void main(){
        Stack <Persona> pila = new Stack();
        pila.push(new Persona("Jose","Garcia","Garcia",18,1));
        pila.push(new Persona("Angel","Garcia","Garcia",18,1));
        pila.push(new Persona("Miguel","Garcia","Garcia",18,1));
        pila.push(new Persona("Antonio","Garcia","Perez",18,1));
        pila.push(new Persona("Melvin","Gonzalez","Pascual",18,1));
        pila.push(new Persona("Sergio","Romero","Cortez",18,1));
        pila.push(new Persona("Daniel","Gonzalez","Sierra",18,1));
        StdOut.println(pila.toString());
        StdOut.println("El ultimo es \n " + pila.pop() + " Eliminandolo, ahora la pila es \n");
        StdOut.println(pila.toString());
        StdOut.println("Clonando a la pila");
        Stack <Persona> pilaClon = pila.clonar();
        StdOut.println("Pila Clonada \n" + pilaClon.toString());
        StdOut.println("\nPila Original \n" + pila.toString());
        
    }
}
